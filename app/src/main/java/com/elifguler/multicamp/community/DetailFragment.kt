package com.elifguler.multicamp.community


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import com.elifguler.multicamp.community.data.model.Leader
import com.elifguler.multicamp.community.data.model.MulticampItem
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val args by navArgs<DetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewName.text= args.argumentx.name
        textViewDescription.text= args.argumentx.description
        LeadName.text= args.argumentx.leader.name
        LeadPhoto.load(args.argumentx.leader.photo)
        imageViewBanner.load(args.argumentx.banner)

    }}