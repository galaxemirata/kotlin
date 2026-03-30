fun main() {
    var myobject=Circle()
    myobject.circle()
    
}

class Circle{
    var pie=22/7
    var radius=14

    fun circle(){
        var area=pie*(radius *radius)
        println("The area of the circle is $area")
    }
}