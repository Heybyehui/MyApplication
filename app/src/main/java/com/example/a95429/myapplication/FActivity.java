package com.example.a95429.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;

public class FActivity extends AppCompatActivity {
    int current=0;
    Button bn_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        final int[] names = new int[]{
                R.id.Image1,
                R.id.Image2,
                R.id.Image3,
                R.id.Image4,
                R.id.Image0
        };

        final ImageView[] views = new ImageView[names.length];

        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                if(msg.what == 0x1){
                    for(int i=0;i<names.length;i++){
                        views[i].setBackgroundResource((i+current)%names.length);
                    }
                    current++;
                }
                super.handleMessage(msg);
            }
        };

        for(int i=0;i<names.length;i++){
            views[i]=(ImageView) findViewById(names[i]);
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x1);
            }
        },0,100);



        bn_back = (Button)findViewById(R.id.fh1);
        bn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FActivity.this,MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
