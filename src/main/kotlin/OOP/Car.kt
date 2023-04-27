package OOP

class Car(owner:String, color:String, engine:String, seater:Int, make:String){
    init {
        println("owner of car is $owner")
        println("color of car is $color")
        println("engine of car is $engine")
        println("is $seater seater car")
        println("make of car is $make")
    }
}

fun main(args: Array<String>) {
    var owner_one = Car("Kelvin", "Red", "1600 horse_power petrol engine", 4, "Toyota Helux")
    println("___end of car 1___")
    var owner_two = Car("Elis", "Green", "6400 horse_power disel engine", 7, "Toyota Noah")
    println("___end of car 2___")
    var owner_three = Car("Marion", "Amber", "10000 horse_power petrol engine", 2, "BMW Karoon")
    println("___end of car 3___")
}