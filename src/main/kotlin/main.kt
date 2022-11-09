fun main() {

    val likes = 102
    println(persons(likes))
    
}

fun persons(likes: Int): String {
    val personsLikes = if (likes % 10 == 1) "Понравилось $likes человеку" else "Понравилось $likes людям"
    return personsLikes
}