package one.digitalinnovation.avengers.application.web.resource

import jakarta.validation.Valid
import one.digitalinnovation.avengers.application.web.resource.request.AvengerRequest
import one.digitalinnovation.avengers.application.web.resource.response.AvengerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/v1/api/avenger"])
class AvengerResource {

    @GetMapping
    fun getAvengers(): = ResponseEntity.ok().body(emptyList<AvengerResponse>())

    @GetMapping("{id}")
    fun getAvengerDetails(@PathVariable("id") id: Long) = ResponseEntity.ok().build<AvengerResponse>()

    @PostMapping
    fun createAvenger(@Valid @RequestBody request: AvengerRequest)
}