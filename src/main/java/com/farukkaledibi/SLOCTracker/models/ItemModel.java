package com.farukkaledibi.SLOCTracker.models;

import javax.persistence.*;

/**
 * @author Faruk Kaledibi
 */
@Entity
@Table(name = "item", schema = "sloc")
public class ItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private Long projectId;

    @Column(nullable = false)
    private Long sprintId;

    @Column(nullable = false)
    private Long languageId;

    @Column(nullable = false)
    private Long files;

    @Column(nullable = false)
    private Long codes;

    @Column(nullable = false)
    private Long comments;

    @Column(nullable = false)
    private Long blanks;

    public Long getId() {
        return Id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getSprintId() {
        return sprintId;
    }

    public void setSprintId(Long sprintId) {
        this.sprintId = sprintId;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public Long getFiles() {
        return files;
    }

    public void setFiles(Long files) {
        this.files = files;
    }

    public Long getCodes() {
        return codes;
    }

    public void setCodes(Long codes) {
        this.codes = codes;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Long getBlanks() {
        return blanks;
    }

    public void setBlanks(Long blanks) {
        this.blanks = blanks;
    }
}
