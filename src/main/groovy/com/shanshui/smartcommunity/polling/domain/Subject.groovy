package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by I336253 on 1/15/2018.
 */
@Entity
class Subject implements Serializable {
    @Id
    @GeneratedValue
    Long id

    String name
    String description
    long submitter
    int supportCount
    int rejectCount
    String[] tags //用来分类
}
