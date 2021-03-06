package com.github.jianqibot.bloginkotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_admin_user")
class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var adminUserId: Int? = null

    var loginUserName: String = ""
        set(loginUserName) {
            field = loginUserName.trim { it <= ' ' }
        }

    var loginPassword: String = ""
        set(loginPassword) {
            field = loginPassword.trim { it <= ' ' }
        }

    var nickName: String? = ""
        set(nickName) {
            field = nickName?.trim { it <= ' ' }
        }

    var locked: Byte = 0
}
