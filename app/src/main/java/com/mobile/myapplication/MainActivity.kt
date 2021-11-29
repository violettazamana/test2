package com.mobile.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var b = 1

    val ex = Ex(x = "qwerrty", y = 12, z = 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calcSum()
        b = 2
        ex.c = 3
        when {
            ex.c == 3 -> {

            }
            ex.b == 2 -> {

            }
        }
    }
}

class Ex {
    constructor()
    constructor(x: String)
    constructor(x: String, y: Int)
    constructor(x: String, y: Int, z: Int)

    var b = 1
    val a = 2
    var c = 3
    private var d = 4
}