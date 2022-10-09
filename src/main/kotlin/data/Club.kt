package data

import kotlinx.serialization.Serializable
@Serializable
data class Club(
    val id: Int,
    val name: String,
    val desc: String,
    val leagueName: String,
    val rating: Int,
    val imageUrl: String
)