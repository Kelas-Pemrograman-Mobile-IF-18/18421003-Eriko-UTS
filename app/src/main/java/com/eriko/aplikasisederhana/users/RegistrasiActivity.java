package com.eriko.aplikasisederhana.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.eriko.aplikasisederhana.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        ButterKnife.bind(this);
    }

    @OnClick(R.id.BtnRegistrasi)
    void registrasi() {
        Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
        startActivity(i);
        finish();

        ButterKnife.bind(this);
    }

    @OnClick(R.id.BtnLogin)
    void login() {
        Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}