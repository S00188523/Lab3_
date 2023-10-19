package com.example.lab3_;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        ImageView menuButton = findViewById(R.id.menu_button);
        ImageView accountButton = findViewById(R.id.account_icon);
        ImageView calenderButton = findViewById(R.id.calender_button);
        ImageView groupButton = findViewById(R.id.groupIcon);
        ImageView chatButton = findViewById(R.id.chatIcon);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChartActivity.this, "This is the menu button", Toast.LENGTH_SHORT).show();
            }
        });
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChartActivity.this, "This is your account", Toast.LENGTH_SHORT).show();
            }
        });
        calenderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChartActivity.this, "this is your calender", Toast.LENGTH_SHORT).show();
            }
        });
        groupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChartActivity.this, "This is your group view", Toast.LENGTH_SHORT).show();
            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChartActivity.this, "This is your chat view", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

