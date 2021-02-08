package com.monoli.activitylifecycleworkshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FifthFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Logger.log("FifthFragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("FifthFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Logger.log("FifthFragment", "onCreateView")
        return inflater.inflate(R.layout.fifth_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Logger.log("FifthFragment", "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Logger.log("FifthFragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Logger.log("FifthFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.log("FifthFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.log("FifthFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.log("FifthFragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.log("FifthFragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Logger.log("FifthFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.log("FifthFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Logger.log("FifthFragment", "onDetach")
    }
    
}