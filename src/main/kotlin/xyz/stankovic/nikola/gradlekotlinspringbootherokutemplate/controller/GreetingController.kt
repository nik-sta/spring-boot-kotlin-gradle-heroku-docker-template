package xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.model.Greeting
import xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.repository.GreetingRepository


@RestController
class GreetingController {

    @Autowired
    lateinit var repository: GreetingRepository

    @PostMapping("/greeting")
    fun createGreeting(@RequestBody newGreeting: Greeting): Greeting = repository.save(newGreeting)

    @GetMapping("/greeting/{id}")
    fun fetchGreeting(@PathVariable id: Long) = repository.findById(id)

    @DeleteMapping("/greeting/{id}")
    fun removeGreeting(@PathVariable id: Long) = repository.deleteById(id)
}