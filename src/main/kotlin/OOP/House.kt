package OOP
class House(owner:String, location:String, price:Int, doors:Int) {
    //intialize our class
    init {
        println("owner of house is $owner")
        println("house is located $location")
        println("house costs $price")
        println("house has $doors")
    }
}
fun main(args: Array<String>) {
    var owner_one = House("MIKE", "Ngara", 25500, 2)
    println("___end of house 1___")
    var owner_two = House("Javez", "Malindi", 96833, 9)
    println("___end of house 2___")
    var owner_three = House("Jazz", "Korvana", 9886505, 6)
    println("___end of house 3___")
    var owner_four = House("Jane", "Mali", 244533, 3)
    println("___end of house 4___")
    var owner_five = House("Gagne", "Mombasa", 9434123, 7)
    println("___end of house 5___")
}