package com.farukkaledibi.SLOCTracker.repositories;

import com.farukkaledibi.SLOCTracker.models.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Faruk Kaledibi
 */
@Repository
public interface ProjectRepository extends JpaRepository<ProjectModel, Long> {
}
