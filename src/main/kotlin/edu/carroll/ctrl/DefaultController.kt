package edu.carroll.ctrl

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DefaultController() {
    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "CS495"
        return "index"
    }
}
