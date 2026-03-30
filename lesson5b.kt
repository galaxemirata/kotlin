fun main() {
    var myobject=Square()
    myobject.square()
    myobject.perimeter()
    
}


class Square{
    var length=10
    var width=10

    fun square(){
        var area=length*width
        println("The area of the square is $area ")

    }

    fun perimeter(){
        var perimeter=2*(length + width)
        println("The perimeter of the square is $perimeter")
    }
}