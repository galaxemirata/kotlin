fun main() {
    var objectCat=cat()
    objectCat.meew()
    objectCat.sleep()
    var objectRabbit=Rabbit()
    objectRabbit.sleep()
    objectRabbit.run()
}

open class Animal{
    fun sleep(){
        println("The animal can sleep")
    }

}

class cat:Animal(){
    fun meew(){
        println("The cat can meew")
    }

}

class Rabbit:Animal(){
    fun run(){
        println("The rabbit can run")
    }

}