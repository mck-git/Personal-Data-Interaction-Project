package data

data class User (val nm : String)
{
    var name : String = nm
    var habits = listOf<Habit>()
}