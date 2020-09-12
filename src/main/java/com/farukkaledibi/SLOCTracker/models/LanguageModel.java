package com.farukkaledibi.SLOCTracker.models;

import javax.persistence.*;

/**
 * @author Faruk Kaledibi
 */
@Entity
@Table(name = "language", schema = "sloc", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})})
public class LanguageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false, unique = true)
    private String name;

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
