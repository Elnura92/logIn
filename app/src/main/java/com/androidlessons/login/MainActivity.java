package com.androidlessons.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView enter, welcome, sign, forgotPswrd, click;
    EditText email, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = findViewById(R.id.signbtn);
        btn.setClickable(false);

        enter = findViewById(R.id.enter);
        welcome = findViewById(R.id.welcometxt);
        sign = findViewById(R.id.signtxt);
        forgotPswrd = findViewById(R.id.passwordtxt);
        click = findViewById(R.id.clicktxt);

        email = findViewById(R.id.email);
        password = findViewById(R.id.pswrd);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().length() > 1 && password.getText().length() > 1) {
                    btn.setBackgroundColor(getResources().getColor(R.color.orange));
                    btn.setClickable(true);
                } else{
                    btn.setBackgroundColor(getResources().getColor(R.color.grey));
                    btn.setClickable(false);
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().length() > 1 && password.getText().length() > 1) {
                    btn.setBackgroundColor(getResources().getColor(R.color.orange));
                    btn.setClickable(true);
                } else{
                    btn.setBackgroundColor(getResources().getColor(R.color.grey));
                    btn.setClickable(false);
                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().length() > 1 && password.getText().length() > 1) {
                    Toast.makeText(MainActivity.this, email.getText() + "\n Здравствуйте", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}