package com.farukkaledibi.SLOCTracker.requests;

import java.io.Serializable;

/**
 * @author Faruk Kaledibi
 */
public class LanguageRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
