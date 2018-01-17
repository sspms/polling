package com.shanshui.smartcommunity.polling.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface ElectionRecordRepository extends CrudRepository<ElectionRecord, Long> {
    @Query('select r from ElectionRecord r where r.election.id = ?1')
    List<ElectionRecord> getElectionRecords(long electionId)
}