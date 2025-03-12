data class Times(val userId: Int,
                 var sickTime: Double,
                 var vacationTime: Double,
                 var personal: Double)

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

// TODO: create a function that 1. Checks for user Id 2.fetches the user times