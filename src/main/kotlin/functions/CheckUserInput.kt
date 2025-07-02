package functions

import model.Users

fun checkUserInput(userName: String, id:Int, employees: List<Users>): Boolean {
    return employees.contains(Users(userName, id))


}