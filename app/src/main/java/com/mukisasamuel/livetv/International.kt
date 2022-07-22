package com.mukisasamuel.livetv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class International : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater!!.inflate(R.layout.fragment_international, container, false)
        val myWeb6 = view?.findViewById(R.id.webview5)as WebView
        myWeb6.apply {
            loadUrl("http://www.freeintertv.com/View/");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }


}
