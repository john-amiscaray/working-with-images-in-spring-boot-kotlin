package me.john.amiscaray.saveimagesexample.entities

import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        // the database column is not nullable, has a max length of 30 characters, is called “username”, and must be unique across all entries
        @Column(nullable = false, length = 30, name = "username", unique = true)
        var username: String,
        // the database column is not nullable and has a name of “password”
        @Column(nullable = false, name = "password")
        var password: String,
        // the database column is called "profile_picture" and it has a type of BLOB
        @Lob
        @Column(name="profile_picture")
        var profilePicture: ByteArray
)