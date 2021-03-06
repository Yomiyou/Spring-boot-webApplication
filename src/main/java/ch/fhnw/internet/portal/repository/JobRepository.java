/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.repository;

import ch.fhnw.internet.portal.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // List<Job> findByBook(Book book);
    // List<Job> findByMember(Member member);
    // Job findById(Integer id);
    // List<Job> findByJobStatus(JobStatus jobStatus);
}
