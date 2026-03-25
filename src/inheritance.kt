open class Animal{

    var age = 2
    var gender ="Male"

}
class Dog : Animal() {
    fun bark(){
        println("woof!! woof!!")
    }
}

class Cat{
    fun meow(){
        println("Meow!! Meow!!")
    }
}

fun main() {
    var animal = Animal()
    var dog = Dog()
    var cat = Cat()

}