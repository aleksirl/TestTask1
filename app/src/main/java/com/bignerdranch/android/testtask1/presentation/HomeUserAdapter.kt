package com.bignerdranch.android.testtask1.presentation

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.testtask1.domain.User


class HomeUserHolder(view: View): RecyclerView.ViewHolder(view){


}

class HomeUserAdapter(var users: List<User>): RecyclerView.Adapter<HomeUserHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeUserHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HomeUserHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

