package com.whatsapp.mypost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArtistAdapterClass(var postList: List<Artist>):RecyclerView.Adapter<ArtistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.artist_list,parent,false)
        return ArtistViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
      var post = postList[position]
        holder.tvAuthor.text = post.author
        holder.tvTitle.text = post.title
        holder.tvDate.text = post.date
        holder.tvPreview.text = post.articlePreview
        holder.tvLink.text = post.link
    }

    override fun getItemCount(): Int {
        return  postList.size
    }
}
class ArtistViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTittle)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
}