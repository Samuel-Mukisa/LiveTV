package com.mukisasamuel.livetv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class Africa : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater!!.inflate(R.layout.fragment_home, container, false)
        val myWeb6 = view?.findViewById(R.id.webview1)as WebView
        myWeb6.apply {
            loadUrl("https://live-tv-channels.org/region/africa");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }



}