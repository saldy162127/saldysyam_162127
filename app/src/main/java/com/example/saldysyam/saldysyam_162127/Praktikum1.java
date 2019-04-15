package com.example.saldysyam.saldysyam_162127;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Praktikum1 extends AppCompatActivity {
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum1);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } finally {
                    startActivity(new Intent(Praktikum1.this,Menu_apps.class));
                    finish();
                }
            }
        });
        thread.start();
    }
    }






