package com.example.bai1_2th3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        txtTen = findViewById(R.id.textViewTen);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                String ten = txtTen.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("chuoi",ten);

                intent.putExtra("dl",bundle);

                startActivity(intent);
            }
        });
    }

}
