package com.example.bai1_2th3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtHello = findViewById(R.id.textViewHello);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dl");

        if(bundle!=null){
            String chuoi = bundle.getString("chuoi");
            txtHello.setText("Xin chao "+ chuoi);
        }
    }
}
