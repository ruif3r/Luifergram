package com.example.luifergram.adapter

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.luifergram.R
import com.example.luifergram.model.Picture
import com.example.luifergram.views.PictureOverviewActivity
import com.squareup.picasso.Picasso

class PictureAdapterRecyclerView(
    private var pictures: ArrayList<Picture>,
    var activity: Activity,
    private var resource: Int
) :
    RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(resource, parent, false)
        return PictureViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pictures.size
    }

    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        val picture : Picture = pictures[position]
        holder.usernameCard.text = picture.userName
        holder.timeCard.text = picture.time
        holder.likeNumberCard.text = picture.likeNumber
        Picasso.get().load(picture.picture).into(holder.pictureCard)
        holder.pictureCard.setOnClickListener {
            val intent = Intent(activity, PictureOverviewActivity::class.java)
            activity.window.exitTransition=android.transition.Explode()
            activity.startActivity(intent,
                ActivityOptionsCompat.makeSceneTransitionAnimation
                    (activity, holder.pictureCard, activity.getString(R.string.transitionName_picture)).toBundle())
        }
    }

    class PictureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var pictureCard: ImageView = itemView.findViewById(R.id.card_picture)
        internal var usernameCard: TextView = itemView.findViewById(R.id.card_textView)
        internal var timeCard: TextView = itemView.findViewById(R.id.card_time_text)
        internal var likeNumberCard: TextView = itemView.findViewById(R.id.like_number_card)

    }
}