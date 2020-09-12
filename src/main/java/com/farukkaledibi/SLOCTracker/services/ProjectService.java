package com.farukkaledibi.SLOCTracker.services;

import com.farukkaledibi.SLOCTracker.models.ProjectModel;
import com.farukkaledibi.SLOCTracker.repositories.ProjectRepository;
import com.farukkaledibi.SLOCTracker.requests.ProjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Faruk Kaledibi
 */
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectModel> findAll() {
        return projectRepository.findAll();
    }

    public ProjectModel addItem(ProjectRequest request) {
        ProjectModel projectModel = new ProjectModel();
        projectModel.setName(request.getName());
        return projectRepository.save(projectModel);
    }

    public ProjectModel findById(Long id) {
        return projectRepository.findOne(id);
    }

    public ProjectModel updateItem(Long id, ProjectRequest request) {
        ProjectModel updatedItem = Optional.ofNullable(projectRepository.findOne(id)).map(project -> {
            project.setName(request.getName());
            return project;
        }).get();
        return projectRepository.save(updatedItem);
    }

    public void deleteItem(Long id) {
        projectRepository.delete(id);
    }
}
