fun main(args: Array<String>) {

   val staff = employees

    while (true) {

        println("please enter your user name: ")
        val name = readLine()?.trim() ?: ""

        println("Please enter your user id(4325):")
        val userId = readLine()?.trim() ?: ""
        val userNum = userId.toInt()

        println(name)
        println(userId)

        //sending the info to check with the database
        val isInDataBase = checkUserInput(name, userNum, staff)

        if (isInDataBase) {
            println("Match Found")
        } else {
            println("Match not found")
        }
    }


}

fun checkUserInput(name: String, id:Int, employees: List<Users>): Boolean {
    return employees.contains(Users(name, id))


}