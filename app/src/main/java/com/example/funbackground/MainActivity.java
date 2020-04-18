package com.example.funbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.WallpaperManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView thanos;
    TextView ironMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thanos = (TextView) findViewById(R.id.thanos);
        ironMan = (TextView) findViewById(R.id.ironMan);
    }

    public void sendThanos(View v)
    {
        thanos.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorChange));

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("person", "thanos");
        startActivity(intent);

        finish();
    }

    public void sendIronMan(View v)
    {
        ironMan.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorChange));

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("person", "IronMan");
        startActivity(intent);

        finish();
    }
}
