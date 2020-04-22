package data

import android.os.Build
import android.os.Parcelable
import androidx.annotation.RequiresApi
import kotlinx.android.parcel.Parcelize
import java.time.LocalDateTime
import java.util.*

@Parcelize
data class LogEntry(val newId:Int) : Parcelable {
    val id : Int = newId
    var outbreak : Boolean = false
    var severity : Int = 0
    @RequiresApi(Build.VERSION_CODES.O)
    val date = LocalDateTime.now()
    var habits : List<Habit> = listOf<Habit>()

    fun addHabit(newHabit : Habit)
    {
        if (!habits.contains(newHabit))
            habits.plus(newHabit)
    }

    fun removeHabit(remHabit: Habit)
    {
        if (habits.contains(remHabit))
            habits.minus(remHabit)
    }
}