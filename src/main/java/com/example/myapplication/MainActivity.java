package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void frame1(View v){

        Intent intent = new Intent();

        intent.setClass(MainActivity.this, success.class);//前面是当前Activity的class类，后面是跳转的Activity的class类

        startActivity(intent);//启动Activity

        //MainActivity.this.finish();//必要情况下关闭当前显示的Activity
    }

}
