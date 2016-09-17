package com.example.lara.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Lara on 14.9.2016..
 */
public class detaljanopis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalji);
        TextView  TVnaslov =(TextView) findViewById(R.id.textView);
        TextView  TVpodnaslov =(TextView) findViewById(R.id.textView2);
        String naslov1 =getIntent().getExtras().getString("naslov");
        TVnaslov.setText(naslov1);
        String podnaslov1 =getIntent().getExtras().getString("podnaslov");
        TVpodnaslov.setText(podnaslov1);
        TVpodnaslov.setMovementMethod(new ScrollingMovementMethod());

    }

}

