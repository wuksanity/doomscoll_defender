package user

import app.App

class User {

    var appList = mutableListOf<App>()

    private fun addNewApp(app: App) {
        appList.add(app)
    }

    fun getTotalRuntime(appName: String) : Int {
        return appList.find{it.name == appName}?.totalRunTime ?: -1
    }

    fun getWeeklyRuntime(appName: String) : Int {
        return appList.find{it.name == appName}?.weeklyRunTime ?: -1
    }

    fun getDailyRuntime(appName: String) : Int {
        return appList.find{it.name == appName}?.dailyRunTime ?: -1
    }

    fun getTimesOpenedToday(appName: String) : Int {
        return appList.find{it.name == appName}?.timesOpenedToday?.first ?: -1
    }

}

fun main() {

    val app1 = App("tiktok")
    app1.dailyRunTime = 50
    val app2 = App("instagram")

    var user1 = User()
    user1.appList.add(app1)
    user1.appList.add(app2)

    println(user1.getDailyRuntime("tiktok"))


}