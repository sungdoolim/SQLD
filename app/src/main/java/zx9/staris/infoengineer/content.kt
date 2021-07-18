package zx9.staris.infoengineer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_content.*
import zx9.staris.infoengineer.content

class content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        val contentText:String=intent.getStringExtra("contents")?:"0"

        val contentTitle:String=intent.getStringExtra("title")?:"0"
        contentTITLE.text=contentTitle
        contentTEXT.text=contentText
    }
}