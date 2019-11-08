package com.example.luifergram.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.luifergram.R
import com.example.luifergram.adapter.PictureAdapterRecyclerView
import com.example.luifergram.model.Picture

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_profile, container, false)
        showToolbar("", false, view)
        val pictureRecycler : RecyclerView = view.findViewById(R.id.cards_picture_profile_reciclerView)
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation= LinearLayoutManager.VERTICAL
        pictureRecycler.layoutManager=linearLayoutManager
        val pictureAdapterRecyclerView = PictureAdapterRecyclerView(buildPictures("https://i.vimeocdn.com/video/703876203_640.jpg", "Luis Villarroel", "5", "0 Likes"),
            activity as AppCompatActivity, R.layout.cardview_picture)
        pictureRecycler.adapter=pictureAdapterRecyclerView
        return view
    }

    fun showToolbar(tittle: String, upButton: Boolean, view: View) {
        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        val act: AppCompatActivity = activity as AppCompatActivity
        act.setSupportActionBar(toolbar)
        act.supportActionBar?.setTitle(tittle)
        act.supportActionBar?.setDisplayHomeAsUpEnabled(upButton)

    }

    fun buildPictures(picture : String, username: String, time : String, likenumber : String) : ArrayList<Picture>{
        val pictures = ArrayList<Picture>()
        pictures.add(Picture(picture, username, time, likenumber))
        return pictures
    }

}
