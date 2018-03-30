package com.example.user.projectgames;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private ImageView btnPlay, btnHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (ImageView) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);

        //final MediaPlayer mp = MediaPlayer.create(this, R.raw.button_sound);

        btnHint = (ImageView) findViewById(R.id.btnHint);
        btnHint.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.button_sound);

        if (v.getId() == R.id.btnPlay){
            /*Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);*/

            mp.start();
            startActivity(new Intent(MainActivity.this,Main2Activity.class));
        }else {
            Toast.makeText(this, "This is hint Button...", Toast.LENGTH_SHORT).show();
        }
    }
}
