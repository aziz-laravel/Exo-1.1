package com.example.ex2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    private EditText surface;
    private EditText nbr;
    private Button calcul;
    private CheckBox piscine;
    private float base;
    private float supp;
    private float total;
    private TextView t1;
    private TextView t2;
    private TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        surface=findViewById(R.id.editTextText3);
        nbr=findViewById(R.id.editTextText4);
        calcul=findViewById(R.id.button);
        piscine=findViewById(R.id.checkBox);
        t1=findViewById(R.id.textView7);
        t2=findViewById(R.id.textView8);
        t3=findViewById(R.id.textView9);

        calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sur = Integer.parseInt(surface.getText().toString());
                float n = Integer.parseInt(nbr.getText().toString());
                base = sur * 2;
                if(piscine.isChecked()){
                    supp = n * 50 +100;
                }
                else{
                    supp = n * 50;
                }
                total = base + supp;
                t1.setText( "Impôt de base : " + base);
                t2.setText( "Impôt supplémentaire : " + supp);
                t3.setText( "Impôt total : " + total);
            }
        });
    }
}
