package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
private ImageView mixing_Auger,brackets,cement_auger,cement_bin;
private ImageView mixing_bowel,agg_gate,agg_bin_mf,agg_bin_ab;
private ImageView body,conveyor_belt,auger,chain_oiler;
private ImageView fbr_feeder,electrical_system,water_system,air_system;
private ImageView admix_system;

    public AdminCategoryActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        mixing_Auger = findViewById(R.id.mixing_auger);
        brackets = findViewById(R.id.brackets);
        cement_auger = findViewById(R.id.cement_auger);
        cement_bin = findViewById(R.id.cement_bin);
        mixing_bowel = findViewById(R.id.mixing_bowel);
        agg_gate = findViewById(R.id.agg_gate);
        agg_bin_mf = findViewById(R.id.agg_bin_mf);
        agg_bin_ab = findViewById(R.id.agg_bin_ab);
        body = findViewById(R.id.body);
        conveyor_belt = findViewById(R.id.conveyor_belt);
        auger = findViewById(R.id.auger);
        chain_oiler = findViewById(R.id.chain_oiler);
        fbr_feeder = findViewById(R.id.fbr_feeder);
        electrical_system = findViewById(R.id. electrical_system);
        water_system = findViewById(R.id.water_system);
        air_system = findViewById(R.id.air_system);
        admix_system = findViewById(R.id.admix_system);








        mixing_Auger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","mixing_Auger");
                startActivity(intent);
            }
        });

        brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","brackets");
                startActivity(intent);
            }
        });

        cement_auger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","cement_auger");
                startActivity(intent);
            }
        });
        cement_bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","cement_bin");
                startActivity(intent);
            }
        });
        mixing_bowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "mixing_bowel");
                startActivity(intent);
            }

        });
        agg_gate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "agg_gate");
                startActivity(intent);
            }

        });
        agg_bin_mf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "agg_bin_mf");
                startActivity(intent);
            }
        });
        agg_bin_ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "agg_bin_ab");
                startActivity(intent);
            }
        });
        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "body");
                startActivity(intent);
            }
        });

        conveyor_belt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "conveyor_belt");
                startActivity(intent);
            }
        });
        auger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "auger");
                startActivity(intent);
            }
        });
        chain_oiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "chain_oiler");
                startActivity(intent);
            }
        });
        fbr_feeder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "fbr_feeder");
                startActivity(intent);
            }
        });
        electrical_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "electrical_system");
                startActivity(intent);
            }
        });
        water_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "water_system");
                startActivity(intent);
            }
        });
        air_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "air_system");
                startActivity(intent);
            }
        });
        admix_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "admix_system");
                startActivity(intent);
            }
        });
    }
}