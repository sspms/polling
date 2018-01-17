package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.OneToMany

/**
 * Created by I336253 on 1/15/2018.
 */
@Entity
class Election extends Poll {

    String position
    String description
    @OneToMany
    List<Candidate> candidates

    ElectionResult result
}
