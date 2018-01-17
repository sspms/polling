package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.ManyToOne

/**
 * Created by I336253 on 1/17/2018.
 */
@Entity
class VoteRecord extends PollRecord {
    @Enumerated(EnumType.STRING)
    VoteOptions option
    @ManyToOne
    Vote vote
}
