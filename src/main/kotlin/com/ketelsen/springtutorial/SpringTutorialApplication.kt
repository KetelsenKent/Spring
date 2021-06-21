package com.ketelsen.springtutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTutorialApplication

fun main(args: Array<String>) {
	runApplication<SpringTutorialApplication>(*args)
}
