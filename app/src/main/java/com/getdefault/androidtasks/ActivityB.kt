package com.getdefault.androidtasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        Log.d("Activity_B", "OnCreate Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity_B", "OnRestart Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity_B", "OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity_B", "OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity_B", "OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity_B", "OnStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_B", "OnDestroy Called")
    }
}