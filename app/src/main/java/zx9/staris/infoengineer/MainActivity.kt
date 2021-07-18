package zx9.staris.infoengineer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*
import zx9.staris.infoengineer.companion.Companion.backKeyPressedTime

class MainActivity : AppCompatActivity() {
    lateinit var toast: Toast

    override fun onStart() {
        super.onStart()
        var pref=getSharedPreferences("session",0)
        var sessionNum=pref?.getInt("num",0)
        toast?.cancel()
        toast= Toast.makeText(this,sessionNum.toString()+"까지 학습했습니다",Toast.LENGTH_LONG)
        toast?.show()

    }

    override fun onBackPressed() {

        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            toast?.cancel()
            //toast?.setText()
            toast= Toast.makeText(this,"\'뒤로\' 버튼을 한번 더 누르시면 종료됩니다.",Toast.LENGTH_LONG)
            toast?.show();

        }
        // 마지막으로 뒤로가기 버튼을 눌렀던 시간에 2초를 더해 현재시간과 비교 후
        // 마지막으로 뒤로가기 버튼을 눌렀던 시간이 2초가 지나지 않았으면 종료
        // 현재 표시된 Toast 취소
        else {
            toast?.cancel()
            ActivityCompat.finishAffinity(this@MainActivity)
            finish()

        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pref=getSharedPreferences("session",0)
        var sessionNum=pref?.getInt("num",0)

        toast= Toast.makeText(this,sessionNum.toString()+"까지 학습했습니다",Toast.LENGTH_LONG)
//        toast.setText(sessionNum.toString()+"까지 학습했습니다")
   //     toast.cancel()
        toast?.show()


        web_rv.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        web_rv.setHasFixedSize(true)
        web_rv.addItemDecoration(
            DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL)
        )// 경계선을 추가합니다
        web_rv.adapter=
            title_adapter(
                this
            )
    }
}