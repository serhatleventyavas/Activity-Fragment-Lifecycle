package com.monoli.activitylifecycleworkshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment: Fragment() {

    var txtHello: TextView? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Logger.log("FirstFragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("FirstFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Logger.log("FirstFragment", "onCreateView")
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Logger.log("FirstFragment", "onViewCreated")
        txtHello = view.findViewById<TextView>(R.id.first_fragment_txtHello)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Logger.log("FirstFragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Logger.log("FirstFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.log("FirstFragment", "onResume")
        txtHello?.text = "Hello World"
    }

    override fun onPause() {
        super.onPause()
        Logger.log("FirstFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.log("FirstFragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.log("FirstFragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Logger.log("FirstFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.log("FirstFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Logger.log("FirstFragment", "onDetach")
    }
}