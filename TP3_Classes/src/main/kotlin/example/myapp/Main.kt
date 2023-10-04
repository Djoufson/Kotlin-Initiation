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
    val myAquarium = Aquarium(width = 25, depth = 25, height = 40)
    myAquarium.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
