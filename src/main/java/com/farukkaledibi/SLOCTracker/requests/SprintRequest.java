package com.farukkaledibi.SLOCTracker.requests;

import java.io.Serializable;

/**
 * @author Faruk Kaledibi
 */
public class SprintRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private Long projectId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
