package com.farukkaledibi.SLOCTracker.controllers;

import com.farukkaledibi.SLOCTracker.models.ProjectModel;
import com.farukkaledibi.SLOCTracker.requests.ProjectRequest;
import com.farukkaledibi.SLOCTracker.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Faruk Kaledibi
 */
@RestController
@RequestMapping(value = "/project", produces = "application/json")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/list")
    public List<ProjectModel> listAllProjects() {
        return projectService.findAll();
    }

    @RequestMapping(value = "/list/{id}")
    public ProjectModel findById(@PathVariable Long id) {
        return projectService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ProjectModel addProject(@RequestBody ProjectRequest request) {
        return projectService.addProject(request);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ProjectModel updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        return projectService.updateProject(id, request);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return true;
    }
}
