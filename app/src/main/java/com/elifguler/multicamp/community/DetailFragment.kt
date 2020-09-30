package com.elifguler.multicamp.community


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val args by navArgs<DetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewName.text = args.argumentx.name
        textViewDescription.text = args.argumentx.description
        LeadName.text = args.argumentx.leader.name
        LeadPhoto.load(args.argumentx.leader.photo)
        imageViewBanner.load(args.argumentx.banner)



        ButtonParticipation.setOnClickListener {
            val url = args.argumentx.links.participation
            val part = Intent(Intent.ACTION_VIEW)
            part.data = Uri.parse(url)
            startActivity(part)
        }
        ButtonYoutube.setOnClickListener {
            val url = args.argumentx.links.youtube
            val youtube = Intent(Intent.ACTION_VIEW)
            youtube.data = Uri.parse(url)
            startActivity(youtube)

        }
        ButtonTwitter.setOnClickListener {
            val url = args.argumentx.links.twitter
            val twitter = Intent(Intent.ACTION_VIEW)
            twitter.data = Uri.parse(url)
            startActivity(twitter)

        }
        ButtonInstagram.setOnClickListener {
            val url = args.argumentx.links.instagram
            val insta = Intent(Intent.ACTION_VIEW)
            insta.data = Uri.parse(url)
            startActivity(insta)

        }
    }
}


