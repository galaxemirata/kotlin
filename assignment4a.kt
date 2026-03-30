fun main() {
    letters()
    println("..................................")
    divisibility()

    }

    
fun letters(){
    for (letters in 'A'..'Z'){
        println(letters)
    }

}


fun divisibility(){
    var number=80
    if (number%5==0 && number%3==0){
        println("FizzBuzz")
    }

    else if(number%3==0){
        println("Fizz")
    }

    else if(number%5==0){
        println("Buzz")
    }

    else{
        println("Invalid entry")
    }
}