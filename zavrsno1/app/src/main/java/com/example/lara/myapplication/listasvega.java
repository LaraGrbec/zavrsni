package com.example.lara.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;




public class listasvega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listasvega);

        List<String> naslovi = new ArrayList<>();
        List<String> podnaslovi = new ArrayList<>();
        naslovi = (List<String>) getIntent().getSerializableExtra("naslovi");
        podnaslovi = (List<String>) getIntent().getSerializableExtra("podnaslovi");

        napraviListu(naslovi, podnaslovi);
    }

    private void napraviListu(final List<String> naslovi, final List<String> podnaslovi) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.tv, naslovi);
        final ListView LVnaslov = (ListView) findViewById(R.id.listView3);
        LVnaslov.setAdapter(adapter);
        LVnaslov.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    String text, podnaslov;
                    text = (String) LVnaslov.getItemAtPosition(i);
                podnaslov=(String) podnaslovi.get(i);
                    intent.putExtra("naslov", text);
                    intent.putExtra("podnaslov", podnaslov);
                    startActivity(intent);
            }
        });

    }
}
