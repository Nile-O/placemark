package ie.wit.placemark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class PlacemarkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)

        Timber.plant(Timber.DebugTree())
        Timber.i("Placemark Activity started..")
    }
}