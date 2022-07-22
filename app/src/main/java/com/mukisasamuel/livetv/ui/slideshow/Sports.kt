package com.mukisasamuel.livetv.ui.slideshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.mukisasamuel.livetv.R


class Sports : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater!!.inflate(R.layout.fragment_home, container, false)
        val myWeb6 = view?.findViewById(R.id.webview1)as WebView
        myWeb6.apply {
            loadUrl("http://bosscast.net/sportsch.php?");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }
}