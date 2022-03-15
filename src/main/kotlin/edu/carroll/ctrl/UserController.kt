package edu.carroll.ctrl

import edu.carroll.jpa.User
import edu.carroll.svc.UserSvc
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PostMapping

@Controller
@RequestMapping("/user")
class UserController(val userSvc: UserSvc) {
    @GetMapping()
    fun index(model: Model): String {
        model["title"] = "AddUser"
        return "addUser"
    }

    @PostMapping()
    fun post(@RequestParam body: Map<String,String>, model: Model): String {
        // No validation is done (Bad Nate, no cookie for you!)
        val dbResult = userSvc.save(User(name = body["username"].toString(), active = true))
        model["title"] = if (dbResult) "success" else "failure"
        return "index"
    }

    @GetMapping("/all")
    fun getUsers(model: Model): String {
        model["title"] = "All Users"
        model["users"] = userSvc.fetchAllUsers()
        return "users"
    }
}
