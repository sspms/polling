package com.shanshui.smartcommunity.polling.domain

import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by I336253 on 1/17/2018.
 */
@Entity
class BillBoard implements Serializable {
    @Id
    @GeneratedValue
    Long id

    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss')
    Date start

    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss')
    Date end
    transient Class type

    long pollingId

    long community
}
