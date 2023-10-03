package example.myapp

class Aquarium (
    private var width: Int = 10,
    private var height: Int = 20,
    private var length: Int = 30){

    fun printSize(){
        println("Width: $width cm\nHeight: $height cm\nLength: $length cm")
    }

    fun changeHeight(newHeight: Int){
        if(height < 0)
            return
        height = newHeight
    }
}
