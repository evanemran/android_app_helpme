package com.example.safety_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText etname,etphone;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn = findViewById(R.id.btnlogin);
        etname = findViewById(R.id.et_name);
        etphone = findViewById(R.id.et_phone);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etname.getText().toString();
                String phone = etphone.getText().toString();
                if (name.equals("") || phone.equals(""))
                {
                    if (name.equals(""))
                    {
                        etname.setError("Enter your name");
                    }
                    else if (phone.equals(""))
                    {
                        etphone.setError("Enter your number");
                    }
                }
                else
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    //LoginActivity.this.finish();
                }
            }
        });
    }
}
