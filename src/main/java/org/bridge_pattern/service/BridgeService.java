package org.bridge_pattern.service;



import org.bridge_pattern.model.abstraction.Application;
import org.bridge_pattern.model.abstraction.Desktop;
import org.bridge_pattern.model.abstraction.Mobile;
import org.bridge_pattern.model.abstraction.Web;
import org.bridge_pattern.model.implementation.Formatter;
import org.bridge_pattern.model.implementation.JSONFormatter;
import org.bridge_pattern.model.implementation.XMLFormatter;
import org.bridge_pattern.model.implementation.YAMLFormatter;
import org.springframework.stereotype.Service;

@Service
public class BridgeService {

    // Método para generar la configuración para una aplicación web en formato JSON
    public String generateWebConfigJson() {
        Formatter formatter = new JSONFormatter();
        Application config = new Web(formatter);
        return config.generateConfig();
    }

    // Método para generar la configuración para una aplicación móvil en formato YAML
    public String generateMobileConfigYaml() {
        Formatter formatter = new YAMLFormatter();
        Application config = new Mobile(formatter);
        return config.generateConfig();
    }

    // Método para generar la configuración para una aplicación de escritorio en formato XML
    public String generateDesktopConfigXml() {
        Formatter formatter = new XMLFormatter();
        Application config = new Desktop(formatter);
        return config.generateConfig();
    }

    // Método general para generar configuración (Puedes hacer más flexible la elección de app y formato)
    public String generateConfig(String appType, String formatType) {
        Formatter formatter;
        Application config;

        // Selección del formato
        switch (formatType) {
            case "json":
                formatter = new JSONFormatter();
                break;
            case "yaml":
                formatter = new YAMLFormatter();
                break;
            case "xml":
                formatter = new XMLFormatter();
                break;
            default:
                throw new IllegalArgumentException("Formato no soportado");
        }

        // Selección de la aplicación
        switch (appType) {
            case "web":
                config = new Web(formatter);
                break;
            case "mobile":
                config = new Mobile(formatter);
                break;
            case "desktop":
                config = new Desktop(formatter);
                break;
            default:
                throw new IllegalArgumentException("Tipo de aplicación no soportado");
        }

        return config.generateConfig();
    }
}
