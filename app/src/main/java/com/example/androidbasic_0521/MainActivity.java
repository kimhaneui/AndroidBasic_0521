package com.example.androidbasic_0521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;

import com.example.androidbasic_0521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvent();
        setValues();
    }
//    이벤트 처리코드 모아두는곳
    void setupEvent(){

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

//    화면에 나와야할 데이터세팅 코드 모아두는 곳
    void setValues(){

    }
}
