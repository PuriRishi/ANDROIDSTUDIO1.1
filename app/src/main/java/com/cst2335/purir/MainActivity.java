package com.cst2335.purir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        String toastmessage = MainActivity.this.getString(R.string.toast_message);
        btn.setOnClickListener(v -> Toast.makeText(MainActivity.this, toastmessage, Toast.LENGTH_SHORT).show());

    }
}