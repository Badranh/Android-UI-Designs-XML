package com.jellyapps.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvName = findViewById(R.id.tv_name);
        tvName.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this,ChatAcitivty.class));
           // finish();
        });
    }
}
