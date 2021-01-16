package com.example.chemistryquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        button=findViewById(R.id.quiz1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenMainActivity();
            }
        });
        button2=findViewById(R.id.quiz2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenMainActivity2();
            }
        });
        button3=findViewById(R.id.quiz3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenMainActivity3();
            }
        });

    }
    public void OpenMainActivity(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void OpenMainActivity2(){
        Intent intent=new Intent(this, Quiz2.class);
        startActivity(intent);

    }
    public void OpenMainActivity3(){
        Intent intent=new Intent(this, Quiz3.class);
        startActivity(intent);

    }

}