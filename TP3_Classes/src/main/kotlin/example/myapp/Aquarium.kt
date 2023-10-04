package example.myapp

import kotlin.math.PI

open class Aquarium (
    protected open var width: Int = 20,
    protected open var height: Int = 40,
    protected open var depth: Int = 100){

    init {
        println("Aquarium initializing...")
    }
    open val shape = "rectangle"
    open val water: Double
        get() = volume * 0.9

    open var volume: Int
        get() = width * height * depth / 1000
        set(value){
            height = (value * 1000) / (width * depth)
        }

//    init {
//        println("Aquarium initializing...")
//    }
//
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume in liters: ${ width * height * depth / 1000}")
//    }

    constructor(numberOfFish: Int) : this() {
        val tank:Double = numberOfFish * 2000 * 1.1
        height = (tank / (depth * width)).toInt()
    }

    fun printSize(){
        println(
            "Width: $width cm Height: $height cm Depth: $depth cm\n" +
            "Volume: $volume L water: $water L (${ water / volume * 100.0 }% full)")
    }

//    fun changeHeight(newHeight: Int){
//        if(height < 0)
//            return
//        height = newHeight
//    }

    fun changeVolume(volume: Int){
        this.volume = volume
    }
}

class TowerTank(override var height: Int, var diameter: Int) : Aquarium(
    width = diameter,
    height = height,
    depth = diameter
){
    override var volume: Int
        get() = (width/2 * depth/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * depth)).toInt()
        }

    override val water: Double = volume * 0.8
    override val shape: String = "cylinder"
}
