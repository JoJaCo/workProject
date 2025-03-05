fun main(args: Array<String>) {
    println("please enter your user name: ")
    val name = readLine()?.trim() ?: ""
    println("Please enter your user id(4325):")
    val userId = readLine()?.toIntOrNull() ?:""

    println(name)
    println(userId)


}

fun checkUserInput(){


}