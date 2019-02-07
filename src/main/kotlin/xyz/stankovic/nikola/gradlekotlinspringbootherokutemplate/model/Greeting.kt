package xyz.stankovic.nikola.gradlekotlinspringbootherokutemplate.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Greeting(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val content: String) {

        private constructor() : this(-1, "")
}