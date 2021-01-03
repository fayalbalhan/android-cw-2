package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.nameholder);
        EditText email = findViewById(R.id.emailholder);
        EditText address = findViewById(R.id.addressholder);
        EditText number = findViewById(R.id.numberholder);
        Button button = findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link = new Intent(MainActivity.this, MainActivity2.class);
                String username = name.getText().toString();
                link.putExtra("Username", username);

                String Gmail = email.getText().toString();
                link.putExtra("Email",Gmail);

                String homeaddress = address.getText().toString();
                link.putExtra("Homeaddress",homeaddress);

                String phone = number.getText().toString();
                link.putExtra("Number",phone);

                startActivity(link);
            }
        });
    }
}