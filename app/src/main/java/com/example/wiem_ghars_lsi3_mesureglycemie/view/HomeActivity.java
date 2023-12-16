package com.example.wiem_ghars_lsi3_mesureglycemie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wiem_ghars_lsi3_mesureglycemie.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        btnConsultation=(Button) findViewById(R.id.btnConsultation);
        btnConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void init()
    {

        btnConsultation = (Button) findViewById(R.id.btnConsultation);


    }
}
