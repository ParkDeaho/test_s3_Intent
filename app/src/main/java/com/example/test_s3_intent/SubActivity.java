package com.example.test_s3_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    private Button btnClose;
    private TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvMsg = findViewById(R.id.tvMsg);

        Intent intent = getIntent();
        String strMsg = intent.getStringExtra("strMsg");
        tvMsg.setText(strMsg);
    }
}