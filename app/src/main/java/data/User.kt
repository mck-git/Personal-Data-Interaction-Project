package data

data class User (val nm : String = "Default")
{
    var name : String = nm
    var habits : MutableList<Habit> = mutableListOf<Habit>()

    fun addHabit(habit: Habit)
    {
        if (!habits.contains(habit)) {
            habits.add(habit)
        }
    }

    fun removeHabit(habit : Habit)
    {
        habits.remove(habit)
    }

}

