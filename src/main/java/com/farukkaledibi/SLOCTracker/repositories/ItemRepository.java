package com.farukkaledibi.SLOCTracker.repositories;

import com.farukkaledibi.SLOCTracker.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Faruk Kaledibi
 */
@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Long> {
}
