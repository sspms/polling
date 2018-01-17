package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

/**
 * Created by I336253 on 1/17/2018.
 */
@Entity
class ElectionRecord extends PollRecord {
    @OneToMany
    List<Candidate> electedCandidates

    @ManyToOne
    Election election
}
