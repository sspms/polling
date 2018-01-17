package com.shanshui.smartcommunity.polling.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface VoteRepository extends CrudRepository<Vote, Long> {
    @Query('select r from Vote r where r.community = ?1')
    List<Vote> getElections(long community)
}