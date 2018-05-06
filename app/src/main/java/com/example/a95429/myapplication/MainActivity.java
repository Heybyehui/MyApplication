package com.example.a95429.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button bn_LinearLayout,bn_RelativeLayout,bn_FrameLayout,bn_TableLayout,bn_GridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn_LinearLayout = (Button)findViewById(R.id.BL);
        bn_RelativeLayout = (Button)findViewById(R.id.BR);
        bn_FrameLayout = (Button)findViewById(R.id.BF);
        bn_TableLayout = (Button)findViewById(R.id.BT);
        bn_GridLayout = (Button)findViewById(R.id.BG);
        bn_LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LActivity.class);
                startActivity(intent);
            }
        });

        bn_RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RActivity.class);
                startActivity(intent);
            }
        });


        bn_TableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TActivity.class);
                startActivity(intent);
            }
        });
        bn_FrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FActivity.class);
                startActivity(intent);
            }
        });
        bn_GridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GActivity.class);
                startActivity(intent);
            }
        });
    }
}
