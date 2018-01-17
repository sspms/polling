package com.shanshui.smartcommunity.polling.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by I336253 on 11/22/2017.
 */
@Entity
class Signature implements Serializable {
    @Id
    @GeneratedValue
    Long id
    long signer
    Date date
    String fileLocation
}
