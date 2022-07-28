package com.example.custometoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toast.makeText(this, "Custom Toast", Toast.LENGTH_LONG).show();

        //Button Action
        Button toastButton;
        toastButton = findViewById(R.id.toastButton);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Custom Toast
                Toast toast = new Toast(getApplicationContext());

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.customToastLayout));
                toast.setView(view);

                TextView toastText = view.findViewById(R.id.toastText);
                toastText.setText("Custom Toast Done");
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }
}