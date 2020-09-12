package com.farukkaledibi.SLOCTracker.services;

import com.farukkaledibi.SLOCTracker.models.SprintModel;
import com.farukkaledibi.SLOCTracker.repositories.SprintRepository;
import com.farukkaledibi.SLOCTracker.requests.LanguageRequest;
import com.farukkaledibi.SLOCTracker.requests.SprintRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Faruk Kaledibi
 */
@Service
public class SprintService {
    @Autowired
    private SprintRepository sprintRepository;

    public List<SprintModel> findAll() {
        return sprintRepository.findAll();
    }

    public SprintModel addSprint(SprintRequest request) {
        SprintModel sprintModel = new SprintModel();
        sprintModel.setName(request.getName());
        sprintModel.setProjectId(request.getProjectId());
        return sprintRepository.save(sprintModel);
    }

    public SprintModel findById(Long id) {
        return sprintRepository.findOne(id);
    }

    public SprintModel updateSprint(Long id, SprintRequest request) {
        SprintModel updatedSprint = Optional.ofNullable(sprintRepository.findOne(id)).map(sprint -> {
            sprint.setName(request.getName());
            sprint.setProjectId(request.getProjectId());
            return sprint;
        }).get();
        return sprintRepository.save(updatedSprint);
    }

    public void deleteSprint(Long id) {
        sprintRepository.delete(id);
    }
}
