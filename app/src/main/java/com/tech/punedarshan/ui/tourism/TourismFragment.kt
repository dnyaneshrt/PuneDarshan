package com.tech.punedarshan.ui.tourism

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.tech.punedarshan.R

class TourismFragment : Fragment() {
var webView:WebView?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_tourism, container, false)
        webView=view.findViewById(R.id.web_view_toruism)

        webView?.loadUrl("https://www.fabhotels.com/blog/temples-in-pune/")

        return view
    }
}