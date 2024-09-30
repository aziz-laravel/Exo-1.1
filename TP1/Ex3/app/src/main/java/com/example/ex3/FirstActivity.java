package com.example.ex3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    private String reponse1;
    private String reponse2;
    private CheckBox choix1;
    private CheckBox choix2;
    private CheckBox choix3;
    private CheckBox choix4;
    private RadioButton rad1;
    private RadioButton rad2;
    private Button suivant;
    private Button quitter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        choix1 = findViewById(R.id.checkBox);
        choix2 = findViewById(R.id.checkBox2);
        choix3 = findViewById(R.id.checkBox3);
        choix4 = findViewById(R.id.checkBox4);
        rad1 = findViewById(R.id.radioButton);
        rad2 = findViewById(R.id.radioButton2);
        suivant = findViewById(R.id.button2);
        quitter = findViewById(R.id.button);

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choix1.isChecked()) {
                    reponse1 = "Multiple Versions Combined.";
                } else {
                    if (choix2.isChecked()) {
                        reponse1 = "Model View Controller.";
                    } else {
                        if (choix3.isChecked()) {
                            reponse1 = "Main Value Compiled.";
                        } else {
                            if (choix4.isChecked()) {
                                reponse1 = "Mandatory Validated Controls.";
                            }
                        }
                    }
                }

                if (rad1.isChecked()) {
                    reponse2 = "Oui.";
                } else {
                    if (rad2.isChecked()) {
                        reponse2 = "Non.";
                    }
                }


                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                intent.putExtra("reponse1", reponse1);
                intent.putExtra("reponse2", reponse2);

                startActivity(intent);


            }


        });

        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
