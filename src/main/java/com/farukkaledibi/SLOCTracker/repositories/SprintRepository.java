package com.farukkaledibi.SLOCTracker.repositories;

import com.farukkaledibi.SLOCTracker.models.SprintModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Faruk Kaledibi
 */
@Repository
public interface SprintRepository extends JpaRepository<SprintModel, Long> {
}
