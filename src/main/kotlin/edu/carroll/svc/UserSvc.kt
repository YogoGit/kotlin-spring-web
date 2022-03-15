package edu.carroll.svc

import edu.carroll.jpa.User
import edu.carroll.jpa.repo.UserRepo

import org.springframework.stereotype.Service

@Service
class UserSvc(val db: UserRepo) {
    fun fetchAllUsers(): List<User> = db.fetchAllUsers()

    fun save(user: User) : Boolean {
        return db.save(user) != null;
    }
}
