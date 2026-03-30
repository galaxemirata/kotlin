fun main() {
    // for loop is a control flow used to navigate through a range of items
    for (number in 20..50){
        println(number)
        
    }


    for (counter in 30..40 step(2)){
        println("The counter is $counter")
    }




    // step ahead use step()

    for (num in 10..100 step(10)){
        println("The num is $num")
    }

    // Going backwards
    for (y in 10 downTo(1)){
        println(y)
    }

    for (x in 20 downTo(5)){
        println(x)
    }
        
    
}