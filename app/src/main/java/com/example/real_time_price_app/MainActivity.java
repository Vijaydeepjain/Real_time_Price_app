package com.example.real_time_price_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView veg;
ImageView fruit;
ImageView petrol;
ImageView gold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     veg = findViewById(R.id.vegetable);
     fruit=findViewById(R.id.fruit);
     petrol=findViewById(R.id.petrol);
     gold =findViewById(R.id.gold);

     veg.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
         Intent intent =new Intent(MainActivity.this,Vegetable.class);
         startActivity(intent);
         }
     });
     fruit.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,fruits.class);
             startActivity(intent);
         }
     });
     petrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,petrol.class);
                startActivity(intent);
            }
        });
     gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,gold.class);
                startActivity(intent);
            }
        });
    }
}