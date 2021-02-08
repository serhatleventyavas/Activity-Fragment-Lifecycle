package com.monoli.activitylifecycleworkshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class FourthFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Logger.log("FourthFragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("FourthFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Logger.log("FourthFragment", "onCreateView")
        return inflater.inflate(R.layout.fourth_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Logger.log("FourthFragment", "onViewCreated")
        childFragmentManager.commit {
            add(R.id.fourth_fragment_container, FifthFragment(), "fifthFragment")
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Logger.log("FourthFragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Logger.log("FourthFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.log("FourthFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.log("FourthFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.log("FourthFragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.log("FourthFragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Logger.log("FourthFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.log("FourthFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Logger.log("FourthFragment", "onDetach")
    }
    
}