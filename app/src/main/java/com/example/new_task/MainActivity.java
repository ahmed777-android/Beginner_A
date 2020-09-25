package com.example.new_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText)findViewById(R.id.edit_1);
        password = (EditText)findViewById(R.id.edit_2) ;
        submit = (Button)findViewById(R.id.btn) ;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!name.getText().toString().isEmpty()&&!password.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.message,Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, R.string.error,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}