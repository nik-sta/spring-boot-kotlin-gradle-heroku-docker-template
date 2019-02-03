package xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.model.Greeting
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {

    private val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

}