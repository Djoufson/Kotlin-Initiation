package example.myapp

class Aquarium (){
    private var width: Int = 20
    private var height: Int = 40
    private var length: Int = 100



    fun printSize(){
        println("Width: $width cm\nHeight: $height cm\nLength: $length cm")
    }

    fun changeHeight(newHeight: Int){
        if(height < 0)
            return
        height = newHeight
    }
}
