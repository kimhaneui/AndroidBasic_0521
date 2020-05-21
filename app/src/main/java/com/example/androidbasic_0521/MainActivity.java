package com.example.androidbasic_0521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEvent();
        setValues();
    }
//    이벤트 처리코드 모아두는곳
    void setupEvent(){

    }

//    화면에 나와야할 데이터세팅 코드 모아두는 곳
    void setValues(){

    }
}
