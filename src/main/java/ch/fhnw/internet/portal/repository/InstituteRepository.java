/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.repository;

import ch.fhnw.internet.portal.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InstituteRepository extends JpaRepository<Institute, Long> {
    Institute findById(Integer id);
    // List<Institute> findByName(String name);
    // List<Institute> findByHead(Person head);
    // Institute findByLocation(Location location);
    // List<Institute> findByLegalNotice(String LegalNotice);
}
