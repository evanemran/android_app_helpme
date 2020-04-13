package com.example.safety_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManageActivity extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {
    Button btnunum;
    TextView txtnumber,txtmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        txtnumber = findViewById(R.id.txtnumber);
        txtmessage = findViewById(R.id.txtmessage);

        btnunum = findViewById(R.id.btnunum);

        btnunum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendialog();
            }
        });
    }
    public void opendialog()
    {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example_dialog");
    }

    @Override
    public void applytexts(String num, String msg) {
        txtnumber.setText(num);
        txtmessage.setText(msg);
    }
}
