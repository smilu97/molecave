package org.socc.molecave

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*
import javax.annotation.PostConstruct

@SpringBootApplication
class MolecaveApplication

fun main(args: Array<String>) {
	runApplication<MolecaveApplication>(*args)
}
