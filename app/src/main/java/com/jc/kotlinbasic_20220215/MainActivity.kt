package com.jc.kotlinbasic_20220215

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.min

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

        btnVariable.setOnClickListener {
//            변수에 대한 문법 연습용 코드

//            본인의 이름을 변수에 담아보자. => 토스트로 띄우자.
            var myName = "고재천"

            val friendName = "이선생"


//            val friendName: String
//            friendName = "이선생"
//            friendName = "김선생"        val 에는 새 값 교체 불가. (Error)

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

            var myBirthYear = 1988

            var myHeight = 166.8


        }

        btnCondition.setOnClickListener {
//            조건문 연습
            val userAge = 16
//            사용자의 나이가 20살 이상? 맞으면 성인입니다. 토스트로
            if (userAge >= 20) {
//                사용자 나이가 20살 이상일 때만 실행 할 내용.
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            } else if (userAge >= 17) {
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            } else if (userAge >= 14) {
//                17살 미만, 14살 이상
                Toast.makeText(this, "중학생입니다.", Toast.LENGTH_SHORT).show()
            } else if (userAge >= 8) {
                Toast.makeText(this, "초등학생입니다.", Toast.LENGTH_SHORT).show()
            } else {
//                위의 모든 질문이 틀렸을 때만 실행할 내용
                Toast.makeText(this, "미취학 아동입니다.", Toast.LENGTH_SHORT).show()
            }

        }

        btnCondition2.setOnClickListener {

//            회사 상황
            val salary = 3600
            val minutes = 50
            val overWork = true

//            취업 조건
//            1. 연봉 3000 이상 AND 출퇴근 시간 30분 이내
            if (salary >= 3000 && minutes < 30) {
                Log.d("조건문2", "연봉과, 거리 모두 OK")
            }

//            2. 연봉 3500 이상 OR 툴퇴근 시간 10분 이내
            if (salary >= 3600 || minutes < 10) {
                Log.d("조건문2", "연봉이나 거리 중 하나 OK")
            }

//            3. 야근만 안하면 됨.
            if (!overWork) {
                Log.d("조건문3", "야근을 안해야 OK")
            }

//            4. 연봉은 2800 이상 AND 출퇴근 시간 30분 이내 AND 야근도 없어야.
            if (salary >= 2000 && minutes < 30 && !overWork) {
                Log.d("조건문4", "연봉 / 거리 / 야근 여부 모두 만족")
            }

        }

    }

}