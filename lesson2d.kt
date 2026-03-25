fun main() {
    val marks=101

    if (marks>0&&marks<=30){
        println("You failed")
    }

    else if(marks>30&&marks<=50){
        println("Average")
    }

    else if(marks>50&&marks<=70){
        println("Above average")
    }

    else if (marks>70&&marks<=100){
        println("You have Passed")
    }


    else{
        println("Invalid marks")
    }
}