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
    val myAquarium = Aquarium(numberOfFish =  29)
    myAquarium.printSize()
    myAquarium.changeVolume(70)
    myAquarium.printSize()
}
