package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class test1 extends AppCompatActivity {
    int j =0;
    public int score;
    public boolean flag1=false,flag2=false,flag3=false,flag4=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
    }

    public void eval(View v){
        j=0;score=0;flag1=false;flag2=false;flag3=false;flag4=false;
        int idi[]=new int[65];
        RadioButton bi[]=new RadioButton[65];
        RadioButton help[]=new RadioButton[5];
        int help_sum=0;
        RadioButton key8=(RadioButton)findViewById(R.id.radioButton15);
        RadioButton key16=(RadioButton)findViewById(R.id.radioButton31);
        RadioButton key25=(RadioButton)findViewById(R.id.radioButton49);
        RadioButton key26=(RadioButton)findViewById(R.id.radioButton51);

        help[1]=(RadioButton)findViewById(R.id.radioButton121);
        help[2]=(RadioButton)findViewById(R.id.radioButton123);
        help[3]=(RadioButton)findViewById(R.id.radioButton125);
        help[4]=(RadioButton)findViewById(R.id.radioButton127);
        for(int i=1;i<=4;i++){
            if(help[i].isChecked()) help_sum++;
        }

        for(int i=1;i<=64;i=i+2) {
            idi[i] = getResources().getIdentifier("radioButton"+i, "id", getPackageName());
            bi[i] = (RadioButton) findViewById(idi[i]);
            if (bi[i].isChecked()) j++;
        }
        score=j-4;
        RadioButton q25=(RadioButton)findViewById(R.id.radioButton49);
        if(score>=25||q25.isChecked()||help_sum>=2)flag1=true;
        else if((score>=20&&score<25)||help_sum==1||key8.isChecked()||key16.isChecked()||key26.isChecked())flag2=true;
        else if(score>=5)flag3=true;
        else flag4=true;
//        Toast.makeText(test1.this, "flag1 is "+flag1, Toast.LENGTH_SHORT).show();
//        Toast.makeText(test1.this, "flag2 is "+flag2, Toast.LENGTH_SHORT).show();
//        Toast.makeText(test1.this, "flag3 is "+flag3, Toast.LENGTH_SHORT).show();
//        Toast.makeText(test1.this, "help_sum= "+help_sum, Toast.LENGTH_SHORT).show();
//          Toast.makeText(test1.this, "score= "+score, Toast.LENGTH_SHORT).show();
          if(flag1){
              Intent intent = new Intent();
              intent.setClass(test1.this,solution1.class);//前面是当前Activity的class类，后面是跳转的Activity的class类
              startActivity(intent);//启动Activity
          }
        if(flag2){
            Intent intent = new Intent();
            intent.setClass(test1.this,solution2.class);//前面是当前Activity的class类，后面是跳转的Activity的class类
            startActivity(intent);//启动Activity
        }
        if(flag3){
            Intent intent = new Intent();
            intent.setClass(test1.this,solution3.class);//前面是当前Activity的class类，后面是跳转的Activity的class类
            startActivity(intent);//启动Activity
        }
        if(flag4){
            Toast.makeText(test1.this, "您的心理健康水平正常!", Toast.LENGTH_SHORT).show();
        }
        
    }

}






