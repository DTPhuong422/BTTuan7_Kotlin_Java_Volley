package com.example.myapplication.tuan4kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class tuan4kot_MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var tvKQ:TextView? = null
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan4kot_main)
        btn = findViewById(R.id.btnkl)
        tvKQ = findViewById(R.id.tvkl)
        val fn=VolleyKotlinFun()
        btn!!.setOnClickListener {
            fn.getJSONArrayOfObjects(context, tvKQ!!)
        }
    }
}