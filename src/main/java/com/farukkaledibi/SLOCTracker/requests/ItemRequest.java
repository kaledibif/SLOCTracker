package com.farukkaledibi.SLOCTracker.requests;

import java.io.Serializable;

/**
 * @author Faruk Kaledibi
 */
public class ItemRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long projectId;

    private Long sprintId;

    private Long languageId;

    private Long files;

    private Long codes;

    private Long comments;

    private Long blanks;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
