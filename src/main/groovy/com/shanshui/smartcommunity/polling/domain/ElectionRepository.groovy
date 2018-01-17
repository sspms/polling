package com.shanshui.smartcommunity.polling.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface ElectionRepository extends CrudRepository<Election, Long> {
    @Query('select r from Election r where r.community = ?1')
    List<Election> getElections(long community)
}