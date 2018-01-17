package com.shanshui.smartcommunity.polling.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface SignatureRepository extends CrudRepository<Signature, Long> {
    @Query('select r from Signature r where r.signer = ?1')
    Signature getMySignature(long userId)
}