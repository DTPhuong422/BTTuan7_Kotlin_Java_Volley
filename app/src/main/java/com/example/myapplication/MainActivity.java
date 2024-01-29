package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    Button btnGetData;
    TextView tvKQ;
    Context context=this;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tuan4VolleyFun volleyFun= new Tuan4VolleyFun();
        tvKQ = findViewById(R.id.tv);
        btnGetData = findViewById(R.id.btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFun.getJsonArrayOfObject(context, tvKQ);
            }
        });
    }
}