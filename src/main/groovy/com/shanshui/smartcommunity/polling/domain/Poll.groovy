package com.shanshui.smartcommunity.polling.domain

import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

/**
 * Created by I336253 on 11/21/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Poll implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Long id
    long initiator
    long community
    String title
    String descripton
    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss')
    Date startDate
    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss')
    Date dueDate
    //Date completeDate
    int total //投票总数
    boolean valid
    String invalidReason
}
