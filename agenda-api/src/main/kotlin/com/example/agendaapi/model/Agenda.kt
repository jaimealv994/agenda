package com.example.agendaapi.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Agenda(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int?,

        val nombre: String,

        val telefono: String
) {
}