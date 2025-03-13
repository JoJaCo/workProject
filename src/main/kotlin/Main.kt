
fun main(args: Array<String>) {

    Ui.start()

}



object Ui{

    val staff = employees
    val employeesTimes = userTimes
    var keepChecking = true
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
                EmployeesInfo(userName,userIdNum)
            } else {
                println("EE is not in the system") }



            println("Would you like to keep checking the database: yes or no  ")
            val keepGoing = readlnOrNull() ?: "Invalid answer"
            keepChecking = keepGoing == "yes"

        }

    }

    /*the end of our while loop*/
    private class EmployeesInfo(name: String, id: Int){
        private val name = name
        private val id = id




    }







    //below are our functions
    private fun commands(option: String) : String {

        val result = when(option){
            "1" -> "Here are your hours"
            "2" -> "Call with Sick Times "
            "3" -> "Call with personal Time "
            "4" -> "request vacation times "
            else -> "Invalid"
        }

        return result
    }

     private fun callOutListOption() {

        println("Here are your list of options for call outs: ")
        println("1: Display your Times ")
        println("2: Call with Sick Times ")
        println("3: Call with personal Time")
        println("4: request vacation times ")
        println("Please input 1,2, 3 or 4 depending on your callout ")
         val option = readLine()?.trim() ?:""
        commands(option)

    }



}


fun checkUserInput(userName: String, id:Int, employees: List<Users>): Boolean {
    return employees.contains(Users(userName, id))


}