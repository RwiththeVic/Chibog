package com.fcpc.chibogservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.security.PrivateKey;

public class MainActivity<publlc> extends AppCompatActivity {
    private Button btnRegister;

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = (Button) findViewById(R.id.btnRegister);
        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistrationActivity();
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

        ImageView Imageview = (ImageView) findViewById(R.id.imageView);
        Imageview.setImageResource(R.drawable.fcpc);

    }

public void openRegistrationActivity() {
        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(intent);
}

    private void validate(String userName, String userPassword) {

        if ((userName.equals("Arvic Cruz")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Ron dela Merced")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

        if ((userName.equals("Josiah Buhayan")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Neil Rico")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Geoffrey Reyes")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Adrian dela Cruz")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Christian Griño")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Iñigo Balmadrid")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Adrian Cueto")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Vinz Dacanay")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Amiel Divinagracia")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("David Manalo")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if ((userName.equals("Cryz Dexter Santos")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }
}


