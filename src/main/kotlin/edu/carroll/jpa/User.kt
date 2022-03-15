package edu.carroll.jpa

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "active")
    var active: Boolean,

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    var emails: Set<Email>? = null
)
