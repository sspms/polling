package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

/**
 * Created by I336253 on 11/22/2017.
 */
@Entity
class ElectionResult implements Serializable {
    @Id
    @GeneratedValue
    Long id

    @OneToMany
    List<Candidate> elected
}
