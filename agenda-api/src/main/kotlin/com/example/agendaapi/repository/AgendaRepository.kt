package com.example.agendaapi.repository

import com.example.agendaapi.model.Agenda
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface AgendaRepository : CrudRepository<Agenda, Int> {
    fun findAgendaByNombreContains(nombre: String): List<Agenda>
}