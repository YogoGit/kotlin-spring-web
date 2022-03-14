package edu.carroll.jpa.repo

import edu.carroll.jpa.User

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface UserRepo : CrudRepository<User, Long> {
    @Query("SELECT u FROM User u")
    fun fetchAllUsers(): List<User>
}
