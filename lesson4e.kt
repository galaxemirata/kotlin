fun main() {
    numbers(20)
    count(10)
    








}

// a function that takes in letter n and prints all numbers from n downwards

fun numbers(n:Int){


var number=n
while(number>=0){
    println(number)
    number--
}
}



fun count(n:Int){
  
for (number in n downTo(0) ){
    println(number)
    
}
}