package com.example.agendaapi.service

import com.example.agendaapi.model.Agenda
import com.example.agendaapi.repository.AgendaRepository
import org.springframework.stereotype.Service

@Service
class AgendaService(val agendaRepository: AgendaRepository) {
    fun guardar(agenda: Agenda) {
        agendaRepository.save(agenda)
    }

    fun buscarTodo(): Iterable<Agenda> {
        return agendaRepository.findAll()
    }

    fun delete(id: Int) {
        agendaRepository.deleteById(id)
    }

    fun buscarPorNombre(nombre: String): List<Agenda> {
        return agendaRepository.findAgendaByNombreContains(nombre)
    }
}