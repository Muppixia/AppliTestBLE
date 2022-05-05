package fr.isen.turcotti.applitestble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import fr.isen.turcotti.applitestble.ble.BluetoothActivity

class MainActivity : AppCompatActivity() {

    private  lateinit var  bluetooth: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       bluetooth = findViewById(R.id.buttonBluetooth)

        val intent = Intent (this, BluetoothActivity::class.java)
        bluetooth.setOnClickListener {
            startActivity(intent)
        }

    }
}