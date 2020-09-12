package com.farukkaledibi.SLOCTracker.controllers;

import com.farukkaledibi.SLOCTracker.models.LanguageModel;
import com.farukkaledibi.SLOCTracker.requests.LanguageRequest;
import com.farukkaledibi.SLOCTracker.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Faruk Kaledibi
 */
@RestController
@RequestMapping(value = "/language", produces = "application/json")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/list")
    public List<LanguageModel> listAllLanguages() {
        return languageService.findAll();
    }

    @RequestMapping(value = "/list/{id}")
    public LanguageModel findById(@PathVariable Long id) {
        return languageService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public LanguageModel addLanguage(@RequestBody LanguageRequest request) {
        return languageService.addLanguage(request);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public LanguageModel updateLanguage(@PathVariable Long id, @RequestBody LanguageRequest request) {
        return languageService.updateLanguage(id, request);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean deleteLanguage(@PathVariable Long id) {
        languageService.deleteLanguage(id);
        return true;
    }
}
