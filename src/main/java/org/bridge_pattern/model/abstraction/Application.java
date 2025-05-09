package org.bridge_pattern.model.abstraction;


import org.bridge_pattern.model.implementation.Formatter;

public abstract class Application {
    protected Formatter formatter;

    public Application(Formatter formatter) {
        this.formatter = formatter;
    }

    public abstract String generateConfig();
}

