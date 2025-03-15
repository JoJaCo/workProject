
fun main(args: Array<String>) {

    Ui.start()

}



object Ui{

    val staff = employees
    var keepChecking = true
    var employee = EmployeesInfo()

    /*info for our program from data classes */

    init {
        println("************************")
        println("Welcome,H & R employee")
        println("************************")
    }

    fun start() {
        while (keepChecking) {

            println()
            println("please enter your user name: ")
            val userName = readLine()?.trim() ?: ""

            println()
            println("Please enter your user id(4325):")
            val userId = readLine()?.trim() ?: ""
            val userIdNum = userId.toInt()


            //add the function for the commands
            val isInDataBase = checkUserInput(userName,userIdNum,staff)

            if (isInDataBase) {

                employee.callOutListOption(userName,userIdNum)


            } else {
                println("EE is not in the system") }

            println("Would you like to keep checking the database: yes or no  ")
            val keepGoing = readlnOrNull() ?: "Invalid answer"
            keepChecking = keepGoing == "yes"

        }

     }

    }

fun checkUserInput(userName: String, id:Int, employees: List<Users>): Boolean {
    return employees.contains(Users(userName, id))


}