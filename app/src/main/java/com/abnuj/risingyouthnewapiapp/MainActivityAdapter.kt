package com.abnuj.risingyouthnewapiapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abnuj.risingyouthnewapiapp.RetrofitModel.Articles

class MainActivityAdapter(val articleList: List<Articles?>) :
    RecyclerView.Adapter<MainActivityAdapter.viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val articles: Articles? = articleList.get(position)
        holder.authortv.text = articles?.author
        holder.titletv.text = articles?.title
        holder.contenttv.text = articles?.content
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    class viewholder(v: View) : RecyclerView.ViewHolder(v) {
        val authortv = v.findViewById<TextView>(R.id.authortv)
        val titletv = v.findViewById<TextView>(R.id.titletv)
        val contenttv = v.findViewById<TextView>(R.id.contenttv)
    }

}

