package com.farukkaledibi.SLOCTracker.services;

import com.farukkaledibi.SLOCTracker.models.LanguageModel;
import com.farukkaledibi.SLOCTracker.repositories.LanguageRepository;
import com.farukkaledibi.SLOCTracker.requests.LanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Faruk Kaledibi
 */
@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    public List<LanguageModel> findAll() {
        return languageRepository.findAll();
    }

    public LanguageModel addLanguage(LanguageRequest request) {
        LanguageModel itemModel = new LanguageModel();
        itemModel.setName(request.getName());
        return languageRepository.save(itemModel);
    }

    public LanguageModel findById(Long id) {
        return languageRepository.findOne(id);
    }

    public LanguageModel updateLanguage(Long id, LanguageRequest request) {
        LanguageModel updatedLanguage = Optional.ofNullable(languageRepository.findOne(id)).map(item -> {
            item.setName(request.getName());
            return item;
        }).get();
        return languageRepository.save(updatedLanguage);
    }

    public void deleteLanguage(Long id) {
        languageRepository.delete(id);
    }
}
