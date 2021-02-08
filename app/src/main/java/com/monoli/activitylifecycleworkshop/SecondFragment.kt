package com.monoli.activitylifecycleworkshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Logger.log("SecondFragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("SecondFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Logger.log("SecondFragment", "onCreateView")
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Logger.log("SecondFragment", "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Logger.log("SecondFragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Logger.log("SecondFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.log("SecondFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.log("SecondFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.log("SecondFragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.log("SecondFragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Logger.log("SecondFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.log("SecondFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Logger.log("SecondFragment", "onDetach")
    }
}