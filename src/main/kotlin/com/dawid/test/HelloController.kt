package com.dawid.test

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("/")
    fun test(): ResponseEntity<String> {
        return ResponseEntity.ok("Jest cool!")
    }
}
