package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var test = "testString"
        var obj: Any? = null

        var array: Array<Int> = Array(10) { _ -> 1}

        var max = Max(1,2)
    }

    fun Max(a: Int, b: Int): Int
    {
        if(a > b)
        {
            return a;
        }

        return b;
    }

    fun When(a: Boolean?)
    {
        var result = when(a)
        {
            true -> "true"
            false -> "false"

            else ->
            {
                "null"
            }
        }
    }

    fun Range()
    {
        var range: IntRange = 1..10

        for (item in range)
        {

        }

        repeat(10)
        {

        }
    }

    fun Lambda()
    {
        var lambda = fun (a: Int, b: Int): Int
        {
            return a + b
        }
    }
}
