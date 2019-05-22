package org.socc.molecave

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.authentication.AuthenticationManagerBeanDefinitionParser
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): Any {

        val res = object {
            val a = "Hello"
            val b = "World"
            val c = listOf(1, 2, "!!")
        }

        return res
    }

}
