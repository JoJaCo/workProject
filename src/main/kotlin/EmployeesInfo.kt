
open class EmployeesInfo(userName:String = "Jorge", id: Int = 1234) {


     fun listOfOptions(userName: String, userId: Int) {
        println(" ${userName} here are your list of options : ")
        println("1: Display your Times ")
        println("2: Call with Sick Times ")
        println("3: Call with personal Time")
        println("4: request vacation times ")
        println("Please input 1,2, 3 or 4 depending on your callout ")

        val option = readLine()?.trim() ?:""

        commands(option, userId)

    }

    private fun commands(option: String, userId: Int)  {

        when(option){
            "1" -> emploreesTimes(userId)
            "2" -> "Call with Sick Times "
            "3" -> "Call with personal Time "
            "4" -> "request vacation times "
            else -> "Invalid"
        }


    }



}