package ie.wit.placemark.main

import android.app.Application
import ie.wit.placemark.models.PlacemarkMemStore
// import ie.wit.placemark.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    val placemarks = PlacemarkMemStore()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemark started")
        }
}