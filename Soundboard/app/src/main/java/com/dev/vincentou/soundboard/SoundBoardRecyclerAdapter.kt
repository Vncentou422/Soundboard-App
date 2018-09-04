package com.dev.vincentou.soundboard
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup


class SoundBoardRecyclerAdapter : RecyclerView.Adapter<SoundBoardRecyclerAdapter.SoundBoardViewHolder>()  {

    private val soundObjects = arrayOf<String>()



    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): {
        val inflatedView = p0.inflate(R.layout.sound_item, false)
        return SoundBoardViewHolder(inflatedView)


    }

    override fun getItemCount(): Int {
       return soundObjects.size
    }

    override fun onBindViewHolder(p0:, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class SoundBoardViewHolder(view : View) : RecyclerView.ViewHolder(view), View.OnClickListener(){
        override fun onClick(p0: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


    }
}