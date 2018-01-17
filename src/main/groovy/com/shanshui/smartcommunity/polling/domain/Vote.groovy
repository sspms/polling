package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.ManyToOne

/**
 * Created by I336253 on 1/17/2018.
 */
@Entity
class Vote extends Poll {
    int ayeCount
    int nayCount
    int abstainCount

    @Enumerated(EnumType.STRING)
    VoteResult finalResult

    @ManyToOne
    Subject subject //subject could be polled for multiple time if necessary
}
