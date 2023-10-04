package example.myapp.decor

import example.myapp.Color
import example.myapp.Direction

fun main(){
//    makeDecorations()
//    makeDecorations2()
    printEnums()
}

fun printEnums(){
    println(Direction.NORTH.name)
    println(Color.RED.ordinal)
    println(Color.GREEN.rgb)
    println(Color.BLUE)
}

fun makeDecorations(){
    val decoration1 = Decoration("granite")
    val decoration2 = Decoration("slate")
    val decoration3 = Decoration("slate")
    println(decoration1)
    println(decoration2)
    println(decoration3)

    println(decoration1 == decoration2)
    println(decoration3 == decoration2)
    println(decoration3 == decoration1)
}

fun makeDecorations2(){
    val decoration = Decoration2("crystal", "wood", "diver")
    println(decoration)

    // Assign all properties to variables
    val (rock, _, diver) = decoration
    println(rock)
    println(diver)
}
