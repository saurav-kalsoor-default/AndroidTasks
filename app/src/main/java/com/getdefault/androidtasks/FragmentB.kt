package com.getdefault.androidtasks

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.getdefault.androidtasks.databinding.FragmentBBinding

class FragmentB : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBBinding.inflate(layoutInflater)

        Log.d("Fragment_B", "OnCreateView Called")

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Fragment_B", "OnCreate Called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("Fragment_B", "OnViewCreated Called")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.d("Fragment_B", "OnViewStateRestored Called")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Fragment_B", "OnStart Called")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Fragment_B", "OnResume Called")
    }

    override fun onPause() {
        super.onPause()

        Log.d("Fragment_B", "OnPause Called")
    }

    override fun onStop() {
        super.onStop()

        Log.d("Fragment_B", "OnStop Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d("Fragment_B", "OnSaveInstanceState Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("Fragment_B", "OnDestroyView Called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Fragment_B", "OnDestroy Called")
    }
}