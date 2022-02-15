package com.jc.kotlinbasic_20220215

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn log 가 눌리면 어떤 코드를 실행할지, 할 일을 설정.
        btnLog.setOnClickListener {
//            로그를 찍어보는 기능 실행. => btnLog 가 클릭 될 때 마다 실행.
            Log.d("메인화면", "로그 버튼 눌림")
            Log.d("메인화면", "추가 로그 찍어보기")
            Log.e("메인화면", "e 모드 찍기")
        }

        btnToast.setOnClickListener {
//            토스트 버튼이 눌리면, Toast 를 만들고 (makeText) 보여주기 (show)
            Toast.makeText(this, "토스트를 띄워봅니다.", Toast.LENGTH_SHORT).show()
        }

    }

}