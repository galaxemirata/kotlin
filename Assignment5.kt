fun main() {

    var employeeObject=Employee()
    employeeObject.manage()
    
}

open class Manager{
    var name="Manager"
    var salary=100000

    fun manage(){
        println("I am the Manager")

    }

}

class Employee:Manager(){
   


}