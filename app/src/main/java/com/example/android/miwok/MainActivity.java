package com.example.android.miwok;

// Importacion de librerias necesarias
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

// Clase Principal
public class MainActivity extends AppCompatActivity {

    @Override

    // Metodo onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Metodo que al hacer click en el textView numbers nos envia a su menu correspondiente
       TextView numbers = (TextView) findViewById(R.id.numbers);
       numbers.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view) {
               Intent numbersIntent = new Intent(MainActivity.this, numbers.class);
               startActivity(numbersIntent);
           }
       });

        // Metodo que al hacer click en el textView colors nos envia a su menu correspondiente
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, colors.class);
                startActivity(colorsIntent);
            }
        });

        // Metodo que al hacer click en el textView family nos envia a su menu correspondiente
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, family.class);
                startActivity(familyIntent);
            }
        });

        // Metodo que al hacer click en el textView phrases nos envia a su menu correspondiente
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, phrases.class);
                startActivity(phrasesIntent);
            }
        });

}

    }