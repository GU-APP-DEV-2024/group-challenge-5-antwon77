package com.zybooks.workingwithdata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.zybooks.workingwithdata.R
import kotlinx.android.synthetic.main.activity_mars_photo_detail.*

class MarsPhotoDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mars_photo_detail)

        val photo = intent.getParcelableExtra<MarsPhoto>("photo")
        Glide.with(this).load(photo?.imgSrc).into(detailImageView)
        detailTextView.text = """
            Rover: ${photo?.roverName}
            Camera: ${photo?.cameraName}
            Date: ${photo?.earthDate}
        """.trimIndent()
    }
}
