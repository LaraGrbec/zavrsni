package com.example.lara.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class zubici extends AppCompatActivity {

    Button dodatno, gumb;
    CheckBox zub1, zub2, zub3, zub4, zub5, zub6, zub7, zub8, zub9, zub10, zub11, zub12, zub13, zub14, zub15, zub16, zub17, zub18, zub19, zub20;
    TextView tv;
    boolean flag = false;

    public static final int REQUEST_CODE_100 = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.glavni);

        zub1 = (CheckBox) findViewById(R.id.zub1);
        zub2 = (CheckBox) findViewById(R.id.zub2);
        zub3 = (CheckBox) findViewById(R.id.zub3);
        zub4 = (CheckBox) findViewById(R.id.zub4);
        zub5 = (CheckBox) findViewById(R.id.zub5);
        zub6 = (CheckBox) findViewById(R.id.zub6);
        zub7 = (CheckBox) findViewById(R.id.zub7);
        zub8 = (CheckBox) findViewById(R.id.zub8);
        zub9 = (CheckBox) findViewById(R.id.zub9);
        zub10 = (CheckBox) findViewById(R.id.zub10);
        zub11 = (CheckBox) findViewById(R.id.zub11);
        zub12 = (CheckBox) findViewById(R.id.zub12);
        zub13 = (CheckBox) findViewById(R.id.zub13);
        zub14 = (CheckBox) findViewById(R.id.zub14);
        zub15 = (CheckBox) findViewById(R.id.zub15);
        zub16 = (CheckBox) findViewById(R.id.zub16);
        zub17 = (CheckBox) findViewById(R.id.zub17);
        zub18 = (CheckBox) findViewById(R.id.zub18);
        zub19 = (CheckBox) findViewById(R.id.zub19);
        zub20 = (CheckBox) findViewById(R.id.zub20);
        gumb = (Button) findViewById(R.id.gumb);

        if (gumb != null) {
            gumb.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), pocetni.class);
                    startActivityForResult(intent, REQUEST_CODE_100);
                }
            });
        }

        dodatno = (Button) findViewById(R.id.dodatno);
        tv = (TextView) findViewById(R.id.textView3);


        zub1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                zub1 = (CheckBox) findViewById(R.id.zub1);
                if (b) {

                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Drugi donji desni kutnjak");
                    intent.putExtra("podnaslov", "Drugi donji desni kutnjak je zub " +
                            "koji obično raste između 20. i 30. mjeseca" +
                            "Kutnjaci služe usitnjavanju i mljevenju hrane. " +
                            "vrlo je važno očuvati ovaj zub pravilnom oralnom higijenom" +
                            " jer on određuje pravilan smještaj prvog trajnog kutnjaka. " +
                            "To je posljednji zub koji niče u donjoj čeljusti. " +
                            "u ovoj dobi česte su i traume zuba pa pročitajte članak " +
                            "Traume zuba pod kategorijom Problemi i bolesti");
                    startActivity(intent);
                }

            }
        });

        zub2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Prvi donji desni kutnjak");
                    intent.putExtra("podnaslov", "Prvi donji desni kutnjak je zub koji služi" +
                            "usitnjavanju i mljevenju hrane. Niče između 12. i 16. mjeseca djetetova " +
                            "života. " +
                            "U ovoj dobi česte su Rekurentne aftozne ulceracije pa pročitajte" +
                            "članak pod kategorijom Problemi i bolesti");
                    startActivity(intent);
                }
            }
        });
        zub3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Donji desni očnjak");
                    intent.putExtra("podnaslov", "Očnjak je zub koji izgledom podsjeća na strjelicu i služi za otkidanje " +
                            "hrane zajedno sa sjekutićima. Donji desni očnjak obično raste nakon donjeg prvog kutnjaka, između " +
                            "12. i 16. mjeseca života. \nPod kategorijom Prevencija pročitajte članak Zašto se mliječni zubi popravljaju?");
                    startActivity(intent);
                }
            }
        });

        zub4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Donji bočni desni sjekutić");
                    intent.putExtra("podnaslov", "Donji desni bočni sjekutić raste oko 7. mjeseca djetetova života. " +
                            "Između prednjih zubi normalno se nalaze razmaci koje ćete uočiti i nisu razlog za brigu. " +
                            "Naprotiv, razmaci su povoljni jer na mjesto malih mliječnih zuba kasnije dolaze trajni koji " +
                            "su veći itrebaju više prostora.\nPod kategorijom Problemi i bolesti pročitajte članak " +
                            "Rani dječji karijes ili karijes bočice ");
                    startActivity(intent);
                }
            }
        });

        zub5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Donji središnji desni sjekutić");
                    intent.putExtra("podnaslov", "Zub koji je izrastao Vašoj bebi zove se donji desni središnji sjekutić. " +
                            "To je najčešće prvi zub koji niče. Raste oko 6. mjeseca života. Čim izraste prvi zub vrijeme je za " +
                            "prvu četkicu i posjet doktoru dentalne medicine. \nPod kategorijom Nicanje zuba pročitajte članak Simptomi nicanja zuba i prva pomoć ");
                    startActivity(intent);

                }
            }
        });


        zub6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Donji lijevi središnji sjekutic");
                    intent.putExtra("podnaslov", "Donji lijevi središnji sjekutić obično niče oko 6. " +
                            "mjeseca života. Ponekad lijevi i desni niču u isto vrijeme, pa su simtomi " +
                            "nicanja više izraženi. Pod kategorijom Nicanje zuba pročitajte članak " +
                            "Redosljed nicanja mliječnih zuba " +
                            " ");
                    startActivity(intent);

                }
            }
        });
        zub7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Donji lijevi bočni sjekutić");
                    intent.putExtra("podnaslov", "Ovaj zubić niče oko 7. mjeseca djetetova " +
                            "života. Ponekad  se djeca već rađaju sa donjim sjekutićima. Pod " +
                            "kategorijom Nicanje zuba proččitajte članak Prerano nicanje " +
                            "i saznajte više o tome.");
                    startActivity(intent);

                }
            }
        });

        zub8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Donji lijevi očnjak");
                    intent.putExtra("podnaslov", "Između 16. i 20. mjeseca djetetu raste očnjak, " +
                            "zub nalilk na strjelicu. Nakon nicanja malih zubi poput sjekutića, " +
                            "tijekom nicanja većih očnjaka simptomi nicanja su znatno izraženiji. " +
                            "Pod kategorijom Problemi i bolesti pročitajte članak Kandidijaza kako " +
                            "biste saznali nešto o toj bolesti koja se javlja kod novorođenčadi");
                    startActivity(intent);

                }
            }
        });

        zub9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Prvi donji lijevi kutnjak");
                    intent.putExtra("podnaslov", "Prvi donji lijevi kutnjak raste između 12. i 16. " +
                            "mjeseca života. Budući da je kutnjak veći i od očnjaka i od sjekutića " +
                            "ponekad su simptomi nicanja izraženiji. ");
                    startActivity(intent);

                }
            }
        });

        zub10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Drugi donji lijevi kutnjak");
                    intent.putExtra("podnaslov", "Drugi donji lijevi kutnjak raste između 20. i 30. " +
                            "mjeseca života. Posljednji je zub koji niče u donjoj čeljsti. Sada " +
                            "su bebi izrasli svi donji zubi");
                    startActivity(intent);

                }
            }
        });

        zub11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Drugi gornji lijevi kutnjak");
                    intent.putExtra("podnaslov", "Drugi gornji lijevi kutnjak je zub koji raste između " +
                            "24. i 30. mjeseca života i posljednji je zub koji niče u gornjoj čeljusti. " +
                            "Najčešće donji drugi kutnjaci niknu prije gornjih, ali nije strogo pravilo. " +
                            "To je posljednji zub koji niče u gornjoj čeljusti i dijete sada ima " +
                            "sve gornje zube. ");
                    startActivity(intent);

                }
            }
        });

        zub12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Prvi gornji lijevi kutnjak");
                    intent.putExtra("podnaslov", "Prvi gornji lijevi kutnjak niče između 14. i 18. " +
                            "mjeseca. Služi za mljevenje i usitnjavanje hrane. U kategoriji Problemi " +
                            "i boelsti pročitajte članak Sisanje prsta i saznajte nešto više o tom " +
                            "problemu. ");
                    startActivity(intent);

                }
            }
        });


        zub13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Gornji lijevi očnjak");
                    intent.putExtra("podnaslov", "Gornji lijevi očnjak niče obično nakon donjeg " +
                            "i to između 18. i 20. mjeseca. U kategoriji Nicanje zuba pročitajte " +
                            "članak Zakašnjelo nicanje i saznajte više o tome. ");
                    startActivity(intent);

                }
            }
        });


        zub14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Gornji lijevi bočni sjekutić");
                    intent.putExtra("podnaslov", "Gornji lijevi bočni sjekutić niče između 8. " +
                            "i 10. mjeseca i kada on nikne dijete najčešće u ustima već ima 6-8 " +
                            "zuba. \nPod kategorijom Prevencija pročitajte članak Rani posjet doktoru dentalne medicine");
                    startActivity(intent);

                }
            }
        });


        zub15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Gornji lijevi središnji sjekutić");
                    intent.putExtra("podnaslov", "Gornji lijevi središnji sjekutić niče nakon donjih " +
                            "i to najčešće između 7. i 8. mjeseca." +
                            "Pod kategorijom Prevencija pročitajte članak Prehrana jer i hrana koju " +
                            "dajemo djetetu te učestalost može utjecati na razvoj karijesa");
                    startActivity(intent);

                }
            }
        });

        zub16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Gornji desni središnji sjekutić");
                    intent.putExtra("podnaslov", "Gornji desni središnji sjekutić niče između 7. i 8. " +
                            "mjeseca. Ponekad gornji lijevi i desni središnji sjekutići niču u isto " +
                            "vrijeme. " +
                            "Pod kategorijom Problemi i bolesti pročitajte članak Kratak jezični nabor " +
                            "i saznajte nešto o tom problemu te kako ga možete izliječiti. ");
                    startActivity(intent);

                }
            }
        });

        zub17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Gornji desni bočni sjekutić");
                    intent.putExtra("podnaslov", "Gornji desni bočni sjekutić niče između " +
                            "8. i 10. mjeseca. Nakon nicanja svih sjekutića dijete ima 8 " +
                            "zuba u ustima. ");
                    startActivity(intent);

                }
            }
        });

        zub18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Gornji desni očnjak");
                    intent.putExtra("podnaslov", "Gornji desni očnjak niče nakon donjeg, između " +
                            "18. i 20. mjeseca. Izgleda poput strjelice i služi za otkidanje zalogaja " +
                            "hrane. " +
                            "");
                    startActivity(intent);
                }
            }
        });


        zub19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Prvi gornji desni kutnjak");
                    intent.putExtra("podnaslov", "Prvi gornji desni kutnjak niče između 14. i 18. " +
                            "mjeseca, prije očnjaka. To znači da nakon nicanja sjekutića između " +
                            "očnjaka i kutnjaka normalno ostaje prazan prostor u koji kasnije niče " +
                            "očnjak." +
                            "Pod kategorijom Prevencija pročitajte članak Oralna higijena.");
                    startActivity(intent);

                }
            }
        });


        zub20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(getApplicationContext(), detaljanopis.class);
                    intent.putExtra("naslov", "Drugi gornji desni kutnjak");
                    intent.putExtra("podnaslov", "Drugi gornji desni kutnjak niče između 24. i 30. " +
                            "mjeseca. To je posljednji zub koji niče u gornjoj čeljusti i dijete " +
                            "sada ima sve gornje zube. ");
                    startActivity(intent);

                }
            }
        });
    }

    @Override
    protected void onActivityResult(int rqstCode, int resultCode, Intent data) {
        if (rqstCode == REQUEST_CODE_100) {
            if (resultCode == RESULT_OK) {
                tv.setText(data.getExtras().getString("ime") + " " + data.getExtras().getString("prezime") +
                        "( " + data.getExtras().getString("dan") + "." + data.getExtras().getString("mjesec") + "."
                        + data.getExtras().getString("godina") + ". )");
                SharedPreferences SP = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = SP.edit();
                editor.putString("podaci", tv.getText().toString());
                editor.commit();
            }
        }
        super.onActivityResult(rqstCode, resultCode, data);
    }

    @Override
    public void onPause() {
        super.onPause();
        SharedPreferences SP = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = SP.edit();
        editor.putBoolean("zub1", zub1.isChecked());
        editor.putBoolean("zub2", zub2.isChecked());
        editor.putBoolean("zub3", zub3.isChecked());
        editor.putBoolean("zub4", zub4.isChecked());
        editor.putBoolean("zub5", zub5.isChecked());
        editor.putBoolean("zub6", zub6.isChecked());
        editor.putBoolean("zub7", zub7.isChecked());
        editor.putBoolean("zub8", zub8.isChecked());
        editor.putBoolean("zub9", zub9.isChecked());
        editor.putBoolean("zub10", zub10.isChecked());
        editor.putBoolean("zub11", zub11.isChecked());
        editor.putBoolean("zub12", zub12.isChecked());
        editor.putBoolean("zub13", zub13.isChecked());
        editor.putBoolean("zub14", zub14.isChecked());
        editor.putBoolean("zub15", zub15.isChecked());
        editor.putBoolean("zub16", zub16.isChecked());
        editor.putBoolean("zub17", zub17.isChecked());
        editor.putBoolean("zub18", zub18.isChecked());
        editor.putBoolean("zub19", zub19.isChecked());
        editor.putBoolean("zub20", zub20.isChecked());
        editor.putString("podaci", tv.getText().toString());
        editor.commit();
    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences SP = getPreferences(Context.MODE_PRIVATE);
        zub1.setChecked(SP.getBoolean("zub1", false));
        zub2.setChecked(SP.getBoolean("zub2", false));
        zub3.setChecked(SP.getBoolean("zub3", false));
        zub4.setChecked(SP.getBoolean("zub4", false));
        zub5.setChecked(SP.getBoolean("zub5", false));
        zub6.setChecked(SP.getBoolean("zub6", false));
        zub7.setChecked(SP.getBoolean("zub7", false));
        zub8.setChecked(SP.getBoolean("zub8", false));
        zub9.setChecked(SP.getBoolean("zub9", false));
        zub10.setChecked(SP.getBoolean("zub10", false));
        zub11.setChecked(SP.getBoolean("zub11", false));
        zub12.setChecked(SP.getBoolean("zub12", false));
        zub13.setChecked(SP.getBoolean("zub13", false));
        zub14.setChecked(SP.getBoolean("zub14", false));
        zub15.setChecked(SP.getBoolean("zub15", false));
        zub16.setChecked(SP.getBoolean("zub16", false));
        zub17.setChecked(SP.getBoolean("zub17", false));
        zub18.setChecked(SP.getBoolean("zub18", false));
        zub19.setChecked(SP.getBoolean("zub19", false));
        zub20.setChecked(SP.getBoolean("zub20", false));
        tv.setText(SP.getString("podaci", "ime prezime (rođenje)"));
    }


    public void sljedeci(View view) {
        Intent intent = new Intent(this, dodatno.class);
        startActivity(intent);
    }


}