package com.shanshui.smartcommunity.polling.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    @Query('select r from Subject r where r.submitter = ?1')
    List<Subject> findMySubjects(long userId)
}