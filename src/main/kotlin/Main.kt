import java.util.Random

/*
* TP 1 d'Atelier de dev mobile
* CHE BENE 19G00266
* NAGA DANIELLE 17G
* ---
* Pour assurer que le code est correct, on va commenter
* le code de chaque partie.
* Il faudra dé-commenter pour tester.
*
* Ou alors visiter le commit correspondant a la partie en question et tester
* */

fun main() {
    // 1. Explore the main function
    // printHello()

    // 2. Learn why (almost) everything has a value
    // val isUnit = println("This is an expression")
    // println(isUnit)

    // val temperature = Random().nextInt(0,100)
    // val isHot = temperature > 50
    // val fistMessage = if(isHot) "$temperature is Hot" else "$temperature is Cold"

    // val secondMessage = "The water temperature is ${ if(isHot) "too warm" else "OK" }"
    // println(fistMessage)
    // println(secondMessage)

    // 3. Learn more about functions
    feedFish()

}
//
//fun printHello(){
//    println("Hello")
//}

fun feedFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eats $food")
}

fun randomDay() : String{
    val days = arrayOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday")

    val randomIndex = Random().nextInt(days.size)
    return days[randomIndex]
}

fun fishFood(day: String) : String{
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}