fun main() {

    val likes = 132121
    println(persons(likes))

}

fun persons(likes: Int): String {
    val personsLikes = if (likes % 10 == 1 && likes % 100 != 11 ) "Понравилось $likes человеку" else "Понравилось $likes людям"
    return personsLikes
}