package data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.util.*

data class LogEntry(val newId:Int)
{
    val id : Int = newId
    var outbreak : Boolean = false
    var severity : Int = 0
    @RequiresApi(Build.VERSION_CODES.O)
    val date = LocalDateTime.now()
    var habits : List<Habit> = listOf<Habit>()




}