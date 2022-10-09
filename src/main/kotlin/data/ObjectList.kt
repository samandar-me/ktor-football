package data

object ObjectList {
    private const val BASE_URL = "http://localhost:8080"
    private const val BASE_URL2 = "http://192.168.43.110:8080/"
    val clubs = listOf(
        Club(
            0,
            "Tottenham",
            "Tottenham is the home of Premier League football club Tottenham Hotspur. From 1899 until 2017, the club's home ground was White Hart Lane",
            "APL",
            3,
            "$BASE_URL/images/tottenham.png"
        ),
        Club(
            1,
            "Real Madrid",
            "Real Madrid has won more Spanish top-division (La Liga) championships (33) than any other Spanish side.",
            "La liga",
            2,
            "$BASE_URL/images/real.png"
        ),
        Club(
            2,
            "Barcelona",
            "FC Barcelona is renowned for its historically skillful and attractive brand of attacking football that places an emphasis on flowing, open play",
            "La liga",
            1,
            "$BASE_URL/images/barselona.png"
        ),
        Club(
            3,
            "Bayern Munich",
            "Bayern Munich was founded in 1900 and has become Germany's most famous and successful football club. Almost all of Bayern's success has come since the 1960s.",
            "Bundesliga",
            3,
            "$BASE_URL/images/bayern.png"
        ),
        Club(
            4,
            "Chelsea",
            "Chelsea is synonymous with the world's most famous flower show, the RHS Chelsea Flower Show",
            "APL",
            4,
            "$BASE_URL/images/chelsea.png"
        ),
        Club(
            5,
            "Juventus",
            "Juventus is one of Italy's oldest and most successful clubs, with more Italian league championships than any other team",
            "A seria",
            3,
            "$BASE_URL/images/juventus.jpg"
        ),
        Club(
            6,
            "Liverpool",
            "It is the most successful English team in European football tournament history, having won six European Cup/Champions League trophies",
            "APL",
            10,
            "$BASE_URL/images/liverpool.png"
        ),
        Club(
            7,
            "Man City",
            "The history of Manchester City Football Club, a professional football club based in Manchester, England. Manchester City have won 29 major honours throughout their history.",
            "APL",
            1,
            "$BASE_URL/images/mancity.png"
        ),
        Club(
            8,
            "PSG",
            "PSG won their first major honour, the French Cup, in 1982 and their first Division 1 title in 1986.",
            "League 1",
            1,
            "$BASE_URL/images/psg.png"
        )
    )
}