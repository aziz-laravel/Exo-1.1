package com.example.ex4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    private EditText nom, email, phone, adresse;
    private Spinner villes;
    private Button envoyer;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        nom = findViewById(R.id.editTextText);
        email = findViewById(R.id.editTextText2);
        phone = findViewById(R.id.editTextText3);
        adresse = findViewById(R.id.editTextText4);
        villes = findViewById(R.id.villes);
        envoyer = findViewById(R.id.button);


        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                intent.putExtra("adresse",adresse.getText().toString());
                intent.putExtra("ville",villes.getSelectedItem().toString());

                startActivity(intent);
            }
        });
    }
}
