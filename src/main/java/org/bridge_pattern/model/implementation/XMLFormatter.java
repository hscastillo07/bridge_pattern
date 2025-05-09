package org.bridge_pattern.model.implementation;

import java.util.Map;

public class XMLFormatter implements Formatter {
    public String formatConfiguration(Map<String, String> configData) {
        StringBuilder sb = new StringBuilder("<config>\n");
        configData.forEach((k, v) -> sb.append("  <").append(k).append(">").append(v).append("</").append(k).append(">\n"));
        sb.append("</config>");
        return sb.toString();
    }
}
