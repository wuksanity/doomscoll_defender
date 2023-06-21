package user

import app.App

class User {

    var appList = mutableListOf<App>()

    private fun addNewApp(app: App) {
        appList.add(app)
    }
}

fun main() {

    val app1 = App("tiktok")
    val app2 = App("instagram")

    var user1 = User()
    user1.appList.add(app1)
    user1.appList.add(app2)

    println(user1.appList)


}