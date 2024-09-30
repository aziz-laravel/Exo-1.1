package com.example.ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView nom, email, phone, adresse, ville;
    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        nom = findViewById(R.id.textView6);
        email = findViewById(R.id.textView7);
        phone = findViewById(R.id.textView8);
        adresse = findViewById(R.id.textView9);
        ville = findViewById(R.id.textView10);
        retour = findViewById(R.id.button2);

        nom.setText("Nom et Prénom: " + this.getIntent().getStringExtra("nom"));
        email.setText("Email : " + this.getIntent().getStringExtra("email"));
        phone.setText("Téléphone : " + this.getIntent().getStringExtra("phone"));
        adresse.setText("Adresse : " + this.getIntent().getStringExtra("adresse"));
        ville.setText("Ville : "+ this.getIntent().getStringExtra("ville"));

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
