package com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "就是我改的我是--->0001", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "你改我也改", Toast.LENGTH_SHORT).show();

    }
}
