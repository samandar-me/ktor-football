package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import routes.clubList

fun Application.configureRouting() {
    routing {
        clubList()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
