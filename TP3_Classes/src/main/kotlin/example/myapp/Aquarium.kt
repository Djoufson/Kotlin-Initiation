package example.myapp

class Aquarium (
    private var width: Int = 20,
    private var height: Int = 40,
    private var depth: Int = 100){

    private var volume: Int
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
            "Volume: $volume L")
    }
//
//    fun changeHeight(newHeight: Int){
//        if(height < 0)
//            return
//        height = newHeight
//    }

    fun changeVolume(volume: Int){
        this.volume = volume
    }
}
