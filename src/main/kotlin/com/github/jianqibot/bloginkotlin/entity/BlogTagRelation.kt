package com.github.jianqibot.bloginkotlin.entity

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_blog_tag_relation")
class BlogTagRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var relationId: Long? = null

    var blogId: Long = 0

    var tagId: Int = 0

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    var createTime: Date = Date()

    override fun toString(): String {
        return "${javaClass.simpleName} [Hash = ${hashCode()}, relationId=$relationId, " +
            "blogId=$blogId, tagId=$tagId, createTime=$createTime]"
    }
}
