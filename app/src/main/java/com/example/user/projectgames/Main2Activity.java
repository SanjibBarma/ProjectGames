package com.example.user.projectgames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView2, imageView3, imageView4, imageView5, imageView6;
    public TextView pointView;

    int increment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CatchIDs();

        IncrementPoint();

    }

    private void CatchIDs() {
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(this);

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(this);

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(this);

        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(this);

        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(this);
    }

    private void IncrementPoint() {
        pointView = (TextView) findViewById(R.id.pointView);
        pointView.setText(String.valueOf(increment));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView2){
            Toast.makeText(this, "Correct!!!", Toast.LENGTH_SHORT).show();

            increment++;
            IncrementPoint();
        }else {
            Toast.makeText(this, "Wrong!!!", Toast.LENGTH_SHORT).show();
        }
    }
}
