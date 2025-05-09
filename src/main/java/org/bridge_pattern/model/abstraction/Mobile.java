package org.bridge_pattern.model.abstraction;

import org.bridge_pattern.model.implementation.Formatter;

import java.util.HashMap;
import java.util.Map;

public class Mobile extends Application {
    public Mobile(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String generateConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("apiBaseUrl", "https://api.example.com");
        config.put("theme", "dark");
        config.put("offlineMode", "true");
        return formatter.formatConfiguration(config);
    }
}
