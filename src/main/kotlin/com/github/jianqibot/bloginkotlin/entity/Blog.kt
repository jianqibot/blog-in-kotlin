package com.github.jianqibot.bloginkotlin.entity

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_blog")
class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var blogId: Long = 0L

    var blogTitle: String = ""
        set(blogTitle) {
            field = blogTitle.trim { it <= ' ' }
        }

    var blogSubUrl: String = ""
        set(blogSubUrl) {
            field = blogSubUrl.trim { it <= ' ' }
        }

    var blogCoverImage: String = ""
        set(blogCoverImage) {
            field = blogCoverImage.trim { it <= ' ' }
        }

    var blogCategoryId: Int = 0

    var blogCategoryName: String = ""
        set(blogCategoryName) {
            field = blogCategoryName.trim { it <= ' ' }
        }

    var blogContent: String = ""
        set(blogContent) {
            field = blogContent.trim { it <= ' ' }
        }

    var blogTags: String = ""
        set(blogTags) {
            field = blogTags.trim { it <= ' ' }
        }

    var blogStatus: Byte = 0

    var blogViews: Long = 0L

    var enableComment: Byte = 0

    var deleted: Byte = 0

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+10")
    var createdTime: Date = Date()

    var updatedTime: Date = Date()
}
