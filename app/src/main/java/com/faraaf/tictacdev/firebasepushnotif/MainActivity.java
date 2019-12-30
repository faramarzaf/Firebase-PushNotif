package com.faraaf.tictacdev.firebasepushnotif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.faraaf.tictacdev.firebasepushnotif.sample1.Sample1Activity;
import com.faraaf.tictacdev.firebasepushnotif.sample2.Sample2Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSample1, btnSample2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSample1 = findViewById(R.id.btnSample1);
        btnSample2 = findViewById(R.id.btnSample2);

        btnSample1.setOnClickListener(this);
        btnSample2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSample1:
                startActivity(new Intent(this, Sample1Activity.class));
                break;

            case R.id.btnSample2:
                startActivity(new Intent(this, Sample2Activity.class));
                break;
        }
    }


}
