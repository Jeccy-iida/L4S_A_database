package app.iida.jessy.realm

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration


class RealmMemoApplication : Application() {
    override fun onCreate(){
        super.onCreate()

        Realm.init(this)
        //データーベースに保存するモデルが変わっても再ダウンロードしなくていい
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}