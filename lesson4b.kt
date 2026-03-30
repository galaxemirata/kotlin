fun main() {
    sum()
    difference()
    division()
    product()
    modulus()
    simpleInterest()
    BMI()
}


// addition
fun sum(){
    var num1=20
    var num2=50

    var add=num1+num2
    println("The sum is $add")

}

// subtraction
fun difference(){
    var num1=80
    var num2=50
    var difference=num1-num2
    println("The differemce is $difference ")
}

// division
fun division(){
    var num1=50
    var num2=2
    var division=num1/num2
    println("The quotient is $division")

}

// multiplication
fun product(){
    var num1=20
    var num2=30
    var product=num1*num2
    println("The product is $product ")

}

// modulus
fun modulus(){
    var num1=20
    var num2=10
    var remainder=num1%num2
    println("The remainder is $remainder")
}

// sim[le interest
fun simpleInterest(){
    var principle=80000
    var rate=4
    var time=6
    var simpleInterest=(principle*rate*time)/100
    println("The Simple Interest is $simpleInterest")
}

// Body Mass Index
fun BMI(){
    var weight=80
    var height=10
    var BMI=weight/height*height
    println("The Body Mass Index is $BMI")
}


