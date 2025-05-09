package org.bridge_pattern.model.abstraction;


import org.bridge_pattern.model.implementation.Formatter;

import java.util.HashMap;
import java.util.Map;

public class Web extends Application {
    public Web(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String generateConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("port", "8080");
        config.put("sessionTimeout", "30");
        config.put("compression", "enabled");
        return formatter.formatConfiguration(config);
    }
}
