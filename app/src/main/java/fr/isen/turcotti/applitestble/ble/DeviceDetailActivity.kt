package fr.isen.turcotti.applitestble.ble

import android.annotation.SuppressLint
import android.bluetooth.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import fr.isen.turcotti.applitestble.CheckInActivity
import fr.isen.turcotti.applitestble.R
import fr.isen.turcotti.applitestble.accueil.AccueilActivity
import fr.isen.turcotti.applitestble.databinding.ActivityDeviceDetailBinding
import java.util.*


@SuppressLint("MissingPermission")
class DeviceDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeviceDetailBinding
    private var bluetoothGatt: BluetoothGatt? = null
    private var timer: Timer? = null
    lateinit var checkInBtn : Button