package com.monoli.activitylifecycleworkshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    val cameraComponent = CameraComponent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.log("MainActivity", "called OnCreate")

        lifecycle.addObserver(cameraComponent)

        val buttonClick = findViewById<Button>(R.id.activity_main_buttonClick)
        buttonClick.setOnClickListener {
            attachFragment(R.id.activity_main_subMainContainer2, FirstFragment(), "firstFragment")
        }

        val buttonClick2 = findViewById<Button>(R.id.activity_main_buttonClick2)
        buttonClick2.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.activity_main_subMainContainer2, ThirdFragment(), "thirdFragment")
            }
        }

        attachFragment(R.id.activity_main_subMainContainer, SecondFragment(), "secondFragment")
        attachFragment(R.id.activity_main_subMainContainer3, FourthFragment(), "fourthFragment")
    }

    private fun attachFragment(containerId: Int, fragment: Fragment, tag: String) {
        supportFragmentManager.commit {
            add(containerId, fragment, tag)
        }
    }

    override fun onStart() {
        super.onStart()
        Logger.log("MainActivity", "called OnStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.log("MainActivity", "called OnResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.log("MainActivity", "called OnPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.log("MainActivity", "called OnStop")
    }

    override fun onDestroy() {
        lifecycle.removeObserver(cameraComponent)
        super.onDestroy()
        Logger.log("MainActivity", "called OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Logger.log("MainActivity", "called OnRestart")
    }
}