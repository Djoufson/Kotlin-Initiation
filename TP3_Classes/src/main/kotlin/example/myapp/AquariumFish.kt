package example.myapp

//abstract class AquariumFish{
//    abstract val color: String
//}

interface FishAction{
    fun eat()
}

interface FishColor{
    val color: String
}

class Shark: FishAction, FishColor by GrayColor {
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class PrintingFishAction(private val food: String) : FishAction{
    override fun eat() {
        println(food)
    }
}

object GoldColor: FishColor{
    override val color: String = "gold"
}

object GrayColor: FishColor{
    override val color: String = "gray"
}

enum class Color(val rgb: Int){
    RED(0xFF0000), GREEN(0x00f00), BLUE(0x0000FF)
}

enum class Direction(val degree: Int){
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}
