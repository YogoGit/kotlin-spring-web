package edu.carroll.ctrl

import edu.carroll.svc.UserSvc
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController(val userSvc: UserSvc) {

    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "CS495"
        return "index"
    }

    @GetMapping("/all")
    fun getUsers(model: Model): String {
        model["title"] = "All Users"
        model["users"] = userSvc.fetchAllUsers()
        return "users"
    }
}
