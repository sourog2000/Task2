package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    @Override
    public void clicked(String text) {
        ListFrag lf = (ListFrag) getSupportFragmentManager().findFragmentById(R.id.shower);
        lf.aduLst(text);
    }
}