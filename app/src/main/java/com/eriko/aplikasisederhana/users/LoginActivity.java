package com.eriko.aplikasisederhana.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.eriko.aplikasisederhana.R;
import com.eriko.aplikasisederhana.admin.HomeAdminActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        ButterKnife.bind(this);

    }

    @OnClick(R.id.BtnRegistrasi)
    void registrasi() {
        Intent i = new Intent(LoginActivity.this, RegistrasiActivity.class);
        startActivity(i);
        finish();

        ButterKnife.bind(this);
    }

        @OnClick(R.id.BtnLogin)
        void menu() {
            Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
            startActivity(i);
            finish();

    }
}