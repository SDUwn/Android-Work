package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;
import java.util.Random;

public class solution3 extends AppCompatActivity {

    VideoView mVideoNet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solution3);
    }

    public void start(View v){
        Toast.makeText(solution3.this, "start is clicked!", Toast.LENGTH_SHORT).show();
        String url="http://ivi.bupt.edu.cn/hls/cctv6hd.m3u8";
//        String url[]=new String[3];
//        url[0]="https://vdept.bdstatic.com/526c624356497437554348376533506d/6a45714e41523658/a6ce0a2008969235b35675bf4634c68aad1bc48738d4458205f9f81f6cea9819930884f1e12675ca1153b6e207143377.mp4?auth_key=1587025827-0-0-d346d26d5d840e71a7d39d1c2c0d2296";
//        url[1]="https://vdept.bdstatic.com/364c4474724d3342656a324d554d7548/5655445465367656/564ea91bfaba73b772ec04b60de75c9cc369db8ef77b8c1be3f3b6d045bdd5ba8333a7adfbf1520e01462249d34b11e4.mp4?auth_key=1587025898-0-0-cc4f69ff714a645a9a7aca3c3a7028b0";
//        url[2]="https://vdept.bdstatic.com/45735a7034624e41346457774c436435/6844643434586774/ff9d09e05c6b948f862c42365507130ade972e9569499bf9f9bb38cec95cef82a33df647b1403ed5c22d597cdab393ad.mp4?auth_key=1587025948-0-0-641dab91085c6448ac3b97c167720326";
//        VideoView videoView=findViewById(R.id.videoView);
//        Random random=new Random();
//        int x=random.nextInt(3);
//        videoView.setVideoPath(url[x]);
        VideoView videoView=(VideoView)findViewById(R.id.videoView);
        videoView.setVideoPath(url);
        videoView.requestFocus();
        videoView.start();
        Button bt=(Button)findViewById(R.id.start);
        bt.setEnabled(false);
    }
    MediaPlayer mMediaPlayer;
    public void startmusic(View v){
        Toast.makeText(solution3.this, "start is clicked!", Toast.LENGTH_SHORT).show();
        String audioUrl = "http://m10.music.126.net/20200416133739/f5d54975ee8ca18ef44a9ff3164af991/ymusic/6f52/5c4e/f802/afac355d40a1834ca87638eeef6579ce.mp3" ;    //这里给一个歌曲的网络地址就行了
        Uri uri = Uri.parse(audioUrl);
        mMediaPlayer=MediaPlayer.create(this,uri);
        mMediaPlayer.start();
//        Button bt_start=(Button)findViewById(R.id.button3);
//        bt_start.setEnabled(false);
        //bt_stop.setEnabled(true);
    }

    public void stopmusic(View v){
        mMediaPlayer.stop();
       // Button bt_stop=(Button)findViewById(R.id.button4);
       // bt_stop.setEnabled(false);
        //bt_start.setEnabled(true);
    }
}
