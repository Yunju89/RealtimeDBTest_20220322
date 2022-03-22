package org.techtown.realtimedbtest_20220322

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        btnSend.setOnClickListener {

            val inputCount = edtContent.text.toString()

//            임시 : DB의 하위항목으로 => message 항목 => 0번 항목의 => content 항목 : 입력내용

            realtimeDB.getReference("message").child("0").child("content").setValue(inputCount)
//            추가 기록 : 현재시간값을 "2022년 3월 5일 오후 5:05" 양식으로 기록

            val now = Calendar.getInstance()
            val sdf = SimpleDateFormat("yyyy년 M월 d일 a h:mm")
            val nowString = sdf.format(now.time)

            realtimeDB.getReference("message").child("0").child("createdAt").setValue(nowString)


        }

    }

    override fun setValues() {

//        DB 연결 -> 값 기록 연습.

        val db = FirebaseDatabase.getInstance("https://realtimedbtest-20220322-4e110-default-rtdb.asia-southeast1.firebasedatabase.app/")     // 싱가폴 DB 주소 대입

//        DB의 하위 항목(Reference) 설정

        val testRef = db.getReference("test")

//        test 항목에 "Hello World!!" 기록

         testRef.setValue("Hello World")

    }
}