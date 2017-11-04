package com.vanajainfotech;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Splash extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vanajainfotech.android.popularmovies.R.layout.splash);

        Thread time = new Thread() {
            @Override
            public void run() {
                super.run();

                try {

                    sleep(1200);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }


            }
        };
        time.start();

    }

    protected void onPause() {
        super.onPause();
        finish();

    }
}
