package com.example.plugins

import com.example.model.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        staticResources("static", "static")

        get("/tasks") {
            call.respond(
                listOf(
                    Task("title" , "hola mundo", Priority.High)
                )
            )
        }
    }
}