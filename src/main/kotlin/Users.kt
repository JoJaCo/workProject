
data class Users(val name:String, val id: Int)

data class Times(val userId: Int,
                 var sickTime: Double,
                 var vacationTime: Double,
                 var personal: Double)

val employees = listOf(
    Users("John Doe", 1001),
    Users("Jane Smith", 1002),
    Users("Alice Johnson", 1003),
    Users("Bob Williams", 1004),
    Users("Charlie Brown", 1005),
    Users("Diana Miller", 1006),
    Users("Ethan Davis", 1007),
    Users("Fiona Wilson", 1008),
    Users("George Martinez", 1009),
    Users("Hannah Anderson", 1010)
)


val userTimes = listOf(
    Times(1001,14.00,30.00, 40.00),
    Times(1002,8.00,20.00, 40.00),
    Times(1003,20.00,10.00, 40.00),
    Times(1004,15.00,35.00, 40.00),
    Times(1005,7.00,12.00, 40.00),
    Times(1006,8.00,34.00, 40.00),
    Times(1007,24.00,23.00, 40.00),
    Times(1008,34.00,34.00, 40.00),
    Times(1009,40.00,32.00, 40.00),
    Times(1010,10.00,15.00, 40.00),
)