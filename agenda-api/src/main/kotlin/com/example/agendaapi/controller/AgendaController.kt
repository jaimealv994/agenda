package com.example.agendaapi.controller

import com.example.agendaapi.model.Agenda
import com.example.agendaapi.service.AgendaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

import javax.xml.ws.Response

@RestController
@RequestMapping("agenda")
class AgendaController(val agendaService: AgendaService) {

    @PostMapping
    fun crear(@RequestBody agenda: Agenda): Agenda {
        agendaService.guardar(agenda)
        return agenda
    }

    @PutMapping
    fun actualizar(@RequestBody agenda: Agenda): Agenda {
        agendaService.guardar(agenda)
        return agenda
    }

    @GetMapping
    fun buscarTodo() = agendaService.buscarTodo()

    @GetMapping("filtro")
    fun buscarPorNombre(@RequestParam("nombre") nombre: String?, @RequestParam("telefono") telefono: String?): ResponseEntity<*> {
        if (nombre == null)
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("El nombre es requerido")

        return ResponseEntity.ok(agendaService.buscarPorNombre(nombre))
    }
}