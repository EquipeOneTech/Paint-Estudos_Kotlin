package com.astronomia.paint2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    lateinit var canvasView: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        canvasView = findViewById(R.id.canvas)
    }

    fun ClearCanvas(view : View){
        canvasView.ClearCanvas()
    }
}
