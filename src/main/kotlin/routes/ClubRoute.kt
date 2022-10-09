package routes

import data.Club
import data.ObjectList
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.clubList() {
    get("/clublist") {
        call.respond(
            HttpStatusCode.OK,
            ObjectList.clubs
        )
    }
    get("/clublist/{id}") {
        val id = call.parameters["id"]?.toInt()
        call.respond(
            HttpStatusCode.OK,
            ObjectList.clubs[id!!]
        )
    }
}
