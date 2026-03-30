fun main() {
    sum(50,20)
    difference(100,60)
    division(50,4)
    product(7,4)
    modulus(85,3)
    simpleInterest(70000,5,4)
    BMI(90,9)
}


// addition
fun sum(num1:Int,num2:Int){
    var sum=num1+num2
    println("The sum is $sum")
    
    

}

// subtraction
fun difference(num1:Int,num2:Int){
    var difference=num1-num2
    println("The difference is $difference ")

}

// division
fun division(num1:Int,num2:Int){
    var division=num1/num2
    println("The quotient is $division")

}

// multiplication
fun product(num1:Int,num2:Int){
    var product=num1*num2
    println("The product is $product")

}

// modulus
fun modulus(num1:Int,num2:Int){
    var modulus=num1%num2
    println("The modulus is $modulus")

}

// simple interest
fun simpleInterest(principle:Int,rate:Int,time:Int){
    var simpleInterest=(principle*rate*time)
    println("The simple interst is $simpleInterest")
}

// Body Mass Index
fun BMI(weight:Int,height:Int){
    var BMI=weight/height*height
    println("The Body Mass Index is $BMI")

}




