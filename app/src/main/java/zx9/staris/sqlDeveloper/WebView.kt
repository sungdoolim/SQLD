package zx9.staris.sqlDeveloper

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.*


class WebView : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val url:String=intent.getStringExtra("url")?:"0"
        starisTistory.settings.javaScriptEnabled=true

        starisTistory.webViewClient= WebViewClient()
        starisTistory.webChromeClient= WebChromeClient()



     //   println(url + "----------------------------------------------------------------------------------------------------------")
     //   val URL="https://staris.tistory.com"+url

     //   println(URL + "----------------------------------------------------------------------------------------------------------")
     //   starisTistory.loadUrl(URL)
    }


}