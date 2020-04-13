package com.example.safety_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    TextView txtstate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.custombtn);
        txtstate = findViewById(R.id.txtstate);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "sending SOS", Toast.LENGTH_SHORT).show();

                //Text sending code
                /*String messageToSend = "Example help message";
                String number = "01632147320";

                SmsManager.getDefault().sendTextMessage(number, null, messageToSend, null,null);
                txtstate.setText("");
                txtstate.setText("Message sent");
                btnClick.setEnabled(false);*/

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(MainActivity.this, ManageActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
