open class EmployeesInfo(userName:String = "Jorge", id: Int = 1234) {


     fun callOutListOption(userName: String,id: Int) {

        println("${userName}, here are your list of options for call outs: ")
        println("1: Display your Times ")
        println("2: Call with Sick Times ")
        println("3: Call with personal Time")
        println("4: request vacation times ")
        println("Please input 1,2, 3 or 4 depending on your callout ")

        val option = readLine()?.trim() ?:""

        println(commands(option,userName,id))

    }

    private fun commands(option: String,userName: String,id: Int) : String {

        val result = when(option){
            "1" -> "Here are your hours ${userName}, ${getTimes(id)}"
            "2" -> "Call with Sick Times "
            "3" -> "Call with personal Time "
            "4" -> "request vacation times "
            else -> "Invalid"
        }

        return result
    }



}