package com.example.fragmentlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragmentleft.FragmentLeftcominterface {
 private BlankFragmentleft fragmentleft;
 private BlankFragmentRight fragmentRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragmentleft LeftFragment= new BlankFragmentleft();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment-)


    }

    @Override
    public void sendMessage() {

    }
}