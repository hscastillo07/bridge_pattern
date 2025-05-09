package org.bridge_pattern.model.implementation;

import java.util.Map;

public class YAMLFormatter implements Formatter {
    @Override
    public String formatConfiguration(Map<String, String> configData) {
        StringBuilder sb = new StringBuilder();
        configData.forEach((k, v) -> sb.append(k).append(": ").append(v).append("\n"));
        return sb.toString();
    }
}
