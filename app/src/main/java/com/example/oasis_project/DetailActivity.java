package com.example.oasis_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.oasis_project.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private Button home_button, ticket_button, site_button, myinfo_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ticket_button = findViewById(R.id.ticket_button);
        ticket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, TicketActivity.class);
                startActivity(intent);
            }
        });

        site_button = findViewById(R.id.site_button);
        site_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, SiteActivity.class);
                startActivity(intent);
            }
        });

        myinfo_button = findViewById(R.id.myinfo_button);
        myinfo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

    }
}