package app

import java.text.SimpleDateFormat
import java.util.*

interface AppInterface {

    var totalRunTime: Int
    var weeklyRunTime: Int
    var dailyRunTime: Int
    var timesOpenedToday: Pair<Int, String>   // <timesOpened, date>

    private fun addTime(time: Int) {
        totalRunTime += time
        weeklyRunTime += time
        dailyRunTime += time
    }

    private fun resetDailies() {
        timesOpenedToday = Pair(0, SimpleDateFormat("dd MMM").format(Date()))
        dailyRunTime = 0
    }

    private fun resetWeeklyTime() {
        weeklyRunTime = 0
    }

}

public class App(val name: String) : AppInterface {

    override var totalRunTime = 0
    override var weeklyRunTime = 0
    override var dailyRunTime = 0
    override var timesOpenedToday = Pair(0, SimpleDateFormat("dd MMM").format(Date()))

}

fun main() {
    println(SimpleDateFormat("dd MMM").format(Date()))
}