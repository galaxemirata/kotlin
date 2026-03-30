fun main() {
    var dogObject=Dog()
    dogObject.eat()
    dogObject.bark()
    println(dogObject.name)
    
}


// Animal is the superclass
open class  Animal{
    var name ="Bosco"
    fun eat(){
        println("The dog can eat")
    }
}


// Dog is the subclass
class Dog:Animal(){
    fun bark(){
        println("The dog $name can bark")
    }
        
}