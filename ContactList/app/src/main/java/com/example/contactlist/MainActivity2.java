package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle one = getIntent().getExtras();
        String a = one.getString("Username");

        Bundle two = getIntent().getExtras();
        String b = two.getString("Email");

        Bundle three = getIntent().getExtras();
        String c = three.getString("Homeaddress");

        Bundle four = getIntent().getExtras();
        String d = four.getString("Number");


        TextView nameInput = findViewById(R.id.textView6);
        nameInput.setText(a);
        TextView emailInput = findViewById(R.id.textView8);
        emailInput.setText(b);
        TextView addressInput = findViewById(R.id.textView10);
        addressInput.setText(c);
        TextView numberInput = findViewById(R.id.textView12);
        numberInput.setText(d);

        numberInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+d));
                startActivity(callIntent);
            }
        });

        emailInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gmail = new Intent(Intent.ACTION_SEND);
                Gmail.putExtra(Intent.EXTRA_EMAIL, b);
                Gmail.setData(Uri.parse("email"+b));
                Gmail.putExtra(Intent.EXTRA_SUBJECT,"Welcome!");
                Gmail.setType("message/rfc822");
                startActivity(Intent.createChooser(Gmail,"Send Email:"));
            }
        });
        

    }
}