package xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class GradleKotlinSpringBootHerokuTemplateApplication

fun main(args: Array<String>) {
    runApplication<GradleKotlinSpringBootHerokuTemplateApplication>(*args)
}
