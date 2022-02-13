package com.example.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private ImageButton letraa;
    private  ImageButton letrae;
    private ImageButton letrai;
    private ImageButton letrao;
    private ImageButton letrau;

    MediaPlayer la;
    MediaPlayer le;
    MediaPlayer li;
    MediaPlayer lo;
    MediaPlayer lu;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letraa = (ImageButton) findViewById (R.id.ibA);
        la = MediaPlayer.create(getApplicationContext(),(R.raw.a1));

        letraa.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                la.start();
            }

        });

        letrae = (ImageButton) findViewById (R.id.ibE);
        le = MediaPlayer.create(getApplicationContext(),(R.raw.e1));

        letrae.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                le.start();
            }

        });

        letrai = (ImageButton) findViewById (R.id.ibI);
        li = MediaPlayer.create(getApplicationContext(),(R.raw.i1));

        letrai.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                li.start();
            }

        });

        letrao = (ImageButton) findViewById (R.id.ibO);
        lo = MediaPlayer.create(getApplicationContext(),(R.raw.o1));

        letrao.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                lo.start();
            }

        });

        letrau = (ImageButton) findViewById (R.id.ibU);
        lu = MediaPlayer.create(getApplicationContext(),(R.raw.u1));

        letrau.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                lu.start();
            }

        });
    }}

