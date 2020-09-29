package com.elifguler.multicamp.community


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.elifguler.multicamp.community.R
import com.elifguler.multicamp.community.data.CommunityAdapter
import com.elifguler.multicamp.community.data.RetrofitProvider
import kotlinx.android.synthetic.main.fragment_banner.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class BannerFragment : Fragment(R.layout.fragment_banner) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        lifecycleScope.launch {
            val response =
                RetrofitProvider.communityApi.getMulticampCommunities()

            recyclerViewCommunity.adapter =
                CommunityAdapter(response) {
                    val direction =
                        BannerFragmentDirections.actionBannerFragmentToDetailFragment(it)
                    findNavController().navigate(direction)
                }
        }
    }
}
