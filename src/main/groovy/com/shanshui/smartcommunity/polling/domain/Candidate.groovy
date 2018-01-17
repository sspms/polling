package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Created by I336253 on 1/15/2018.
 */
@Entity
class Candidate implements Serializable {
    @Id
    @GeneratedValue
    Long id

    String name
    String photo
    String profile

    int vote
    boolean elected
    @ManyToOne
    Election election
    long community
    long user
}
