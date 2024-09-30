package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button toastButton, countButton;
    private TextView counterText;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // Initialiser les boutons et le TextView
        toastButton = findViewById(R.id.button);
        countButton = findViewById(R.id.button2);
        counterText = findViewById(R.id.textView);

        // Gérer le clic sur le bouton "Toast"
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "Hello World !", Toast.LENGTH_LONG).show();
            }
        });

        // Gérer le clic sur le bouton "Count" pour incrémenter le compteur
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                counterText.setText(String.valueOf(counter));
            }
        });
    }
}
