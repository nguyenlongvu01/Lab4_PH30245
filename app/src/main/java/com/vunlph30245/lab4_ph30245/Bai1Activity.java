package com.vunlph30245.lab4_ph30245;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.vunlph30245.lab4_ph30245.Fragment.ContactFragment;
import com.vunlph30245.lab4_ph30245.Fragment.HomeFragment;

public class Bai1Activity extends AppCompatActivity {
    FrameLayout frameLayout;
    Button btnHome, btnContact;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);

        frameLayout = findViewById(R.id.frContent);
        btnHome = findViewById(R.id.btnHome);
        btnContact = findViewById(R.id.btnContact);
        fragmentManager = getSupportFragmentManager();

        HomeFragment homeFragment = new HomeFragment();
        fragmentManager.beginTransaction().replace(R.id.frContent, homeFragment).commit();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               HomeFragment homeFragment = new HomeFragment();
               fragmentManager.beginTransaction().replace(R.id.frContent, homeFragment).commit();

            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContactFragment contactFragment = new ContactFragment();
                fragmentManager.beginTransaction().replace(R.id.frContent, contactFragment).commit();
            }
        });

    }
}