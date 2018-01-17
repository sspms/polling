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
abstract class PollRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Long id
    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss.SSS')
    Date date
    long user
    Signature signature
    long community
}
