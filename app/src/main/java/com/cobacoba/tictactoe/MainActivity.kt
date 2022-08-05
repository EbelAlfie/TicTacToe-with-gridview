package com.cobacoba.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var gridAdapter: ButtonAdapter
    private lateinit var listButton: MutableList<GridButton>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var spanCount: Int = 3
        var i: Int = 0
        playground.layoutManager = GridLayoutManager(this, spanCount)
        /*while(i != spanCount*spanCount){

        }*/
        var one: GridButton = GridButton(0, "")
        var two: GridButton = GridButton(1, "")
        var three: GridButton = GridButton(2, "")
        var four: GridButton = GridButton(3, "")
        var five: GridButton = GridButton(4, "")
        var six: GridButton = GridButton(5, "")
        var seven: GridButton = GridButton(6, "")
        var eight: GridButton = GridButton(7, "")
        var nine: GridButton = GridButton(8, "")
        listButton = mutableListOf(one, two, three, four, five, six, seven, eight, nine)

        gridAdapter = ButtonAdapter(listButton)
        playground.adapter = gridAdapter

        btn_reset.setOnClickListener {

        }
    }
}