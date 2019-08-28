package com.github.moko256.HelloWorld

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            TextView(this).apply {
                setText("Hello, World!")
            }
        )
    }

}
