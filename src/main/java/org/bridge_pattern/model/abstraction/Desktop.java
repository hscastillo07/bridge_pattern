package org.bridge_pattern.model.abstraction;

import org.bridge_pattern.model.implementation.Formatter;

import java.util.HashMap;
import java.util.Map;

public class Desktop extends Application {
    public Desktop(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String generateConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("windowSize", "1024x768");
        config.put("autoUpdate", "false");
        config.put("theme", "light");
        return formatter.formatConfiguration(config);
    }
}
