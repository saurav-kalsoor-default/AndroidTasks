package com.getdefault.androidtasks

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("Activity_A", "OnCreate Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity_A", "OnRestart Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity_A", "OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity_A", "OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity_A", "OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity_A", "OnStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_A", "OnDestroy Called")
    }
}