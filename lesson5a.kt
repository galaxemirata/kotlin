fun main() {
    // Object Oriented Programming
    var myobject=Person()
    myobject.eat()
    myobject.speak()



}

class Person{
    // state of class person

    var name="Joe"
    var age=20
  

    // behaviours or functions or methods

    fun speak(){
        println("The person $name can speak")
    }


    fun eat(){
        println("The person $name can eat and is $age years old")
    }


    fun walk(){
        println("The person $name who is $age years old can walk ")
    }
}