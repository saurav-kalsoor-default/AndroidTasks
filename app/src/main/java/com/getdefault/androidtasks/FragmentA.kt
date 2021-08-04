package com.getdefault.androidtasks

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.getdefault.androidtasks.databinding.FragmentABinding

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentABinding.inflate(layoutInflater)

        Log.d("Fragment_A", "OnCreateView Called")

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Fragment_A", "OnCreate Called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("Fragment_A", "OnViewCreated Called")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.d("Fragment_A", "OnViewStateRestored Called")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Fragment_A", "OnStart Called")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Fragment_A", "OnResume Called")
    }

    override fun onPause() {
        super.onPause()

        Log.d("Fragment_A", "OnPause Called")
    }

    override fun onStop() {
        super.onStop()

        Log.d("Fragment_A", "OnStop Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("Fragment_A", "OnDestroyView Called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Fragment_A", "OnDestroy Called")
    }
}