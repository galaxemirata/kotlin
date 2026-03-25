fun main() {
    // when statement- used when you don't want to write too many else if statements

    var marks=90

    when (marks){

        // ranges in x..y
        in 1..30->println("Below Average")
        in 31..50->println("Average")
        in 51..70->println("Above average")
        in 71..100->println("You Passed")

        else->println("invalid marks")

        
        
        
        
        
        
        
    }
    val day =4
    
    val result = when (day){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"

        else->println("invalid")
        

    }
    println(result)

}