package org.bridge_pattern.model.implementation;

import java.util.Map;

public class JSONFormatter implements Formatter {
    @Override
    public String formatConfiguration(Map<String, String> configData) {
        StringBuilder sb = new StringBuilder("{\n");
        configData.forEach((k, v) -> sb.append("  \"").append(k).append("\": \"").append(v).append("\",\n"));
        if (!configData.isEmpty()) sb.setLength(sb.length() - 2); // remove last comma
        sb.append("\n}");
        return sb.toString();
    }
}
