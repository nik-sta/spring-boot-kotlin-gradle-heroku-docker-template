package xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.model.Greeting

@Repository
interface GreetingRepository : CrudRepository<Greeting, Long> {
    fun findByContent(contant: String): Iterable<Greeting>
}