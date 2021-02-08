package com.monoli.activitylifecycleworkshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ThirdFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Logger.log("ThirdFragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("ThirdFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Logger.log("ThirdFragment", "onCreateView")
        return inflater.inflate(R.layout.third_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Logger.log("ThirdFragment", "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Logger.log("ThirdFragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Logger.log("ThirdFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.log("ThirdFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.log("ThirdFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.log("ThirdFragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.log("ThirdFragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Logger.log("ThirdFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.log("ThirdFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Logger.log("ThirdFragment", "onDetach")
    }
    
}