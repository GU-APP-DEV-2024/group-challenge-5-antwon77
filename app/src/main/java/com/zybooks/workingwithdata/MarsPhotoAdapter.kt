package com.zybooks.workingwithdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zybooks.workingwithdata.R
import kotlinx.android.synthetic.main.item_mars_photo.view.*

class MarsPhotoAdapter(
    private val photos: List<MarsPhoto>,
    private val onClick: (MarsPhoto) -> Unit
) : RecyclerView.Adapter<MarsPhotoAdapter.MarsPhotoViewHolder>() {

    class MarsPhotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(photo: MarsPhoto, onClick: (MarsPhoto) -> Unit) {
            Glide.with(itemView.context).load(photo.imgSrc).into(itemView.photoImageView)
            itemView.photoDescriptionTextView.text = "${photo.roverName} - ${photo.cameraName}"
            itemView.setOnClickListener { onClick(photo) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsPhotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mars_photo, parent, false)
        return MarsPhotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarsPhotoViewHolder, position: Int) {
        holder.bind(photos[position], onClick)
    }

    override fun getItemCount() = photos.size
}