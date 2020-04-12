package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);

//        Button buttonA = (Button) findViewById(R.id.button);
//        buttonA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(success.this, "sectionA is clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    public void funcA(View v){

        Intent intent = new Intent();

        intent.setClass(success.this,test.class);//前面是当前Activity的class类，后面是跳转的Activity的class类
        startActivity(intent);//启动Activity

        //MainActivity.this.finish();//必要情况下关闭当前显示的Activity
    }
}
