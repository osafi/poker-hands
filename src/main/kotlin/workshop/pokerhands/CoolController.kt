package workshop.pokerhands

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CoolController {
    @GetMapping("/coolstuff")
    fun coolStuff(): ResponseEntity<String> {
        return ResponseEntity.ok().body("We are so cool.")
    }
}