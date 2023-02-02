package com.cst2335.purir;

import static android.provider.ContactsContract.Intents.Insert.EMAIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        String toastmessage = MainActivity.this.getString(R.string.toast_message);
        btn.setOnClickListener(v -> Toast.makeText(MainActivity.this, toastmessage, Toast.LENGTH_SHORT).show());

        Switch mySwitch = (Switch) findViewById(R.id.Switch);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                String message = "The switch is now " + (isChecked ? "on" : "off");
                Snackbar snackbar = Snackbar.make(findViewById(R.id.Switch), message, Snackbar.LENGTH_LONG);
                snackbar.setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cb.setChecked(!isChecked);
                    }
                });
                snackbar.show();
            }
        });


    }
}