package xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleKotlinSpringBootHerokuTemplateApplication

fun main(args: Array<String>) {
    runApplication<GradleKotlinSpringBootHerokuTemplateApplication>(*args)
}
