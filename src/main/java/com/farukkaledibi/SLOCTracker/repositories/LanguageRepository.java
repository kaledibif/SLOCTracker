package com.farukkaledibi.SLOCTracker.repositories;

import com.farukkaledibi.SLOCTracker.models.LanguageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Faruk Kaledibi
 */
@Repository
public interface LanguageRepository extends JpaRepository<LanguageModel, Long> {
}
