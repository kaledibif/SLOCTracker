package com.farukkaledibi.SLOCTracker.controllers;

import com.farukkaledibi.SLOCTracker.models.SprintModel;
import com.farukkaledibi.SLOCTracker.requests.SprintRequest;
import com.farukkaledibi.SLOCTracker.services.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Faruk Kaledibi
 */
@RestController
@RequestMapping(value = "/sprint", produces = "application/json")
public class SprintController {
    @Autowired
    private SprintService sprintService;

    @RequestMapping(value = "/list")
    public List<SprintModel> listAllSprints() {
        return sprintService.findAll();
    }

    @RequestMapping(value = "/list/{id}")
    public SprintModel findById(@PathVariable Long id) {
        return sprintService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public SprintModel addSprint(@RequestBody SprintRequest request) {
        return sprintService.addSprint(request);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public SprintModel updateSprint(@PathVariable Long id, @RequestBody SprintRequest request) {
        return sprintService.updateSprint(id, request);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean deleteSprint(@PathVariable Long id) {
        sprintService.deleteSprint(id);
        return true;
    }
}
