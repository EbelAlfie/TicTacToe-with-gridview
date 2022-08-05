package com.cobacoba.tictactoe

import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.onebar.view.*

class ButtonAdapter(
    private var barList: MutableList<GridButton>
) : RecyclerView.Adapter<ButtonAdapter.ButtonViewHolder>(){
    var turns: Boolean = false

    class ButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    fun addEl(cell: GridButton){
        barList.add(cell)
        notifyItemInserted(barList.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonViewHolder {
        return ButtonViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.onebar, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ButtonViewHolder, position: Int) {
        var oneSquare : GridButton = barList[position]
        holder.itemView.apply {
            playStatus.text = oneSquare.status
            playStatus.setOnClickListener(View.OnClickListener {
                if(turns && playStatus.text.equals("")){
                    playStatus.text = "X"
                    playStatus.setTextColor(resources.getColor(R.color.player_red))
                    turns = false
                }else if(!turns && playStatus.text.equals("")){
                    playStatus.text = "O"
                    playStatus.setTextColor(resources.getColor(R.color.player_blue))
                    turns = true
                }
            })
        }
    }



    override fun getItemCount(): Int {
        return barList.size
    }

}