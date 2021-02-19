package jp.techacademy.chiaki.hata.taskapp

import android.app.Application
import io.realm.Realm

class TaskApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init (this)
    }
}