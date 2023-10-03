import java.util.Random

/*
* TP 1 d'Atelier de dev mobile
* CHE BENE 19G00266
* NAGA DANIELLE 17G97488
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
    // feedFish()

    // 4. Explore default values and compact functions
    // Step 1: Default parameter
    // swim()
    // swim("slow")
    // swim(speed = "turtle-like")
    // Step2: Required parameters
    // feedFish()
    // Step3: Make compact functions

    // 5. Get started with filters
    // val decorations = listOf(
    //     "rock",
    //     "pagoda",
    //     "plastic plant",
    //     "alligator",
    //     "flowerpot"
    // )

    // val filtered = decorations.filter { it[0] == 'p' }
    // println(filtered)

    // 6. Get started with lambdas and HOF (Higher-Order Functions)
    // Step 1: Learn about lambdas
    val dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    // Step 2: Create a HOF
    println(updateDirty(30, waterFilter))
    println(updateDirty(30, ::increaseDirty))
}

//
//fun printHello(){
//    println("Hello")
//}
//
//fun feedFish(){
//    val day = randomDay()
//    val food = fishFood(day)
//    println("Today is $day and the fish eats $food")
//    println("Change water: ${shouldChangeWater(day)}")
//}
//
//fun randomDay() : String{
//    val days = arrayOf(
//        "Monday",
//        "Tuesday",
//        "Wednesday",
//        "Thursday",
//        "Friday",
//        "Saturday",
//        "Sunday")
//
//    val randomIndex = Random().nextInt(days.size)
//    return days[randomIndex]
//}
//
//fun fishFood(day: String) : String{
//    var food = ""
//    when (day) {
//        "Monday" -> food = "flakes"
//        "Tuesday" -> food = "pellets"
//        "Wednesday" -> food = "redworms"
//        "Thursday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        "Saturday" -> food = "lettuce"
//        "Sunday" -> food = "plankton"
//    }
//    return food
//}
//
//fun swim(speed: String = "fast"){
//    println("Swimming $speed")
//}
//
//fun shouldChangeWater(
//    day: String,
//    temperature: Int = 22,
//    dirty: Int = 20)
//: Boolean{
//    return when{
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else -> false
//    }
//}
//
//fun isTooHot(temperature: Int) = temperature > 30
//fun isDirty(dirty: Int) = dirty > 30
//fun isSunday(day: String) = day == "Sunday"

fun updateDirty(
    dirty: Int,
    operation: (Int) -> Int
): Int{
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1