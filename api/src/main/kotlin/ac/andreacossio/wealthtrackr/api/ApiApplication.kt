package ac.andreacossio.wealthtrackr.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class ApiApplication {
    @GetMapping
    fun hello(): String {
        return "Hello World!"
    }
}

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
