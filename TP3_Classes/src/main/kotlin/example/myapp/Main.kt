package example.myapp
/*
* TP 3 d'Atelier de dev mobile
* CHE BENE 19G00266
* NAGA DANIELLE 17G97488
* ---
* */

fun main(){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.changeHeight(10)
    println("____________")
    myAquarium.printSize()
}
