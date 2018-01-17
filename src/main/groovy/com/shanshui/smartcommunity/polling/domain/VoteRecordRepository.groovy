package com.shanshui.smartcommunity.polling.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface VoteRecordRepository extends CrudRepository<VoteRecord, Long> {
    @Query('select r from VoteRecord r where r.vote.id = ?1')
    List<VoteRecord> getVoteRecords(long voteId)
}