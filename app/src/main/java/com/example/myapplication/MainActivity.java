package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton button1 = findViewById(R.id.imageButton1);
        final TextView t1 = findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                System.out.println("clicked");
                if (t1.getText()== "fuck you"){
                    t1.setText("Computer Scince");
                }
                else {
                    t1.setText("fuck you");
                }
            }
        });
    }
}