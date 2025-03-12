
fun main(args: Array<String>) {

    Ui.start()

}



object Ui{

    val staff = employees
    var keepChecking = true


    init {
        println("************************")
        println("Welcome,H & R employee")
        println("************************")
    }

    fun start() {
        while (keepChecking) {

            println()
            println("please enter your user name: ")
            val name = readLine()?.trim() ?: ""

            println()
            println("Please enter your user id(4325):")
            val userId = readLine()?.trim() ?: ""
            val userNum = userId.toInt()


            //sending the info to check with the database
            val isInDataBase = checkUserInput(name, userNum, staff)

            //result from checking the database
            if (isInDataBase) {
                println("Welcome ${name}, hope you are having a great day ")
                val userCommand = commands()
                println(userCommand)
            } else {
                println("Match not found")

            }



            println("Would you like to keep checking the database: yes or no  ")
            val keepGoing = readlnOrNull() ?: "Invalid answer"
            keepChecking = keepGoing == "yes"

        }
        /*the end of our while loop*/


    }
    private fun commands() : String {

        val result = when(callOutListOption()){
            "1" -> // TODO: call Times.kt to display the users times
            "2" -> "Call with Sick Times "
            "3" -> "Call with personal Time "
            "4" -> "request vacation times "
            else -> "Invalid"
        }

        return result
    }




    private fun callOutListOption(): String? {

        println("Here are your list of options for call outs: ")
        println("1: Calling out due to being Sick ")
        println("2: Calling out due to Doctors appointment ")
        println("3: Calling out due to Personal matters ")
        println("4: other ")
        println("Please input 1,2, 3 or 4 depending on your callout ")
        return readLine()?.trim() ?:""

    }


}


fun checkUserInput(name: String, id:Int, employees: List<Users>): Boolean {
    return employees.contains(Users(name, id))


}