package com.farukkaledibi.SLOCTracker.models;

import javax.persistence.*;

/**
 * @author Faruk Kaledibi
 */
@Entity
@Table(name = "sprint", schema = "sloc")
public class SprintModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long projectId;

    public Long getId() {
        return Id;
    }

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
