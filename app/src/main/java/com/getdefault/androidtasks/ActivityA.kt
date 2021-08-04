package com.getdefault.androidtasks

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.getdefault.androidtasks.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityABinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Activity_A", "OnCreate Called")

        binding.btnNavigate.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
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