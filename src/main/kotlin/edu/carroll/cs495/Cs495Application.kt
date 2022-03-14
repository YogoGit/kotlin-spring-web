package edu.carroll.cs495

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@ComponentScan(basePackages = ["edu.carroll"])
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = ["edu.carroll.jpa.repo"])
@EntityScan("edu.carroll.jpa")
class Cs495Application

fun main(args: Array<String>) {
    runApplication<Cs495Application>(*args)
}
