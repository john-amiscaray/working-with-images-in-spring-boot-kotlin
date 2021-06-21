package me.john.amiscaray.saveimagesexample.dao

import me.john.amiscaray.saveimagesexample.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<User, Long>