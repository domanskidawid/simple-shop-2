package com.dawid.test

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("/")
    fun test(): ResponseEntity<String> {
        return ResponseEntity.ok("Normalny Hello world")
    }

    @GetMapping("/users")
    fun users(): ResponseEntity<User> {
        return ResponseEntity.ok(User("Tomasz", "Aktuszer tobiasz"))
    }
    @GetMapping("/products")
    fun products(): ResponseEntity<User> {
        return ResponseEntity.ok(User("products", "Chuj products"))
    }
}
data class User(val name: String, val surname: String)
