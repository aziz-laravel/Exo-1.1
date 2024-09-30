package com.example.ex3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView text1,text2;
    private Button retour;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text1 = findViewById(R.id.textView6);
        text2 = findViewById(R.id.textView7);
        retour = findViewById(R.id.button4);

        text1.setText("1. Le pattern MVC signifie : "+this.getIntent().getStringExtra("reponse1"));
        text2.setText("2. La syntaxe $[x] est permise en JSP : "+this.getIntent().getStringExtra("reponse2"));

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.this.finish();
            }
        });
    }
}
