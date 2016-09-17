package com.example.lara.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pocetni extends AppCompatActivity {

    EditText unosiime, unosprezime, tdan, tmjesec, tgodina;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pocetni);

        button = (Button) findViewById(R.id.button);
         unosiime = (EditText) findViewById(R.id.unosimee);
         unosprezime = (EditText) findViewById(R.id.unosprezime);
         tdan = (EditText) findViewById(R.id.tdan);
        tmjesec = (EditText) findViewById(R.id.tmjesec);
         tgodina = (EditText) findViewById(R.id.tgodina);


    }

    public void idinaapk(View view) {
        Intent intent = new Intent();
        intent.putExtra("ime",unosiime.getText().toString());
        intent.putExtra("prezime", unosprezime.getText().toString());
        intent.putExtra("dan", tdan.getText().toString());
        intent.putExtra("mjesec", tmjesec.getText().toString());
        intent.putExtra("godina", tgodina.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }


}
