package com.elifguler.multicamp.community.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.elifguler.multicamp.community.R
import com.elifguler.multicamp.community.data.model.MulticampItem
import kotlinx.android.synthetic.main.fragment_detail.view.*
import kotlinx.android.synthetic.main.item_community.view.imageViewBanner
import kotlinx.android.synthetic.main.item_community.view.textViewName

class CommunityAdapter(
    private val multicamp: ArrayList<MulticampItem>,
    private val onClick: (MulticampItem) -> Unit
) :
    RecyclerView.Adapter<CommunityViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunityViewHolder {
        return CommunityViewHolder(parent.inflate(R.layout.item_community))
    }


    override fun getItemCount() = multicamp.size
    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        val note= multicamp[position]
        holder.bind(note, onClick)
    }
}

fun ViewGroup.inflate(itemCommunity: Int) :View {
    val layoutInflater = LayoutInflater.from(context)
    return layoutInflater.inflate(itemCommunity, this,false)
}

class CommunityViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(multicampItem: MulticampItem, onClick: (MulticampItem) -> Unit) {
        itemView.imageViewBanner.load(multicampItem.banner)
        itemView.textViewName.text = multicampItem.name
        itemView.textViewDescription.text= multicampItem.description
        itemView.LeadName.text= multicampItem.leader.name
        itemView.LeadPhoto.load(multicampItem.leader.photo)

        itemView.setOnClickListener {
            onClick(multicampItem)
        }
    }
}
