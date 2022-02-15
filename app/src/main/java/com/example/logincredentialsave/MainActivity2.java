package com.example.logincredentialsave;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView dynamic_name;
    Button logout;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dynamic_name = findViewById(R.id.textView3);
        logout = findViewById(R.id.logout);



//        SharedPreferences retrive = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences retrive  = getSharedPreferences("Login",MODE_PRIVATE);
//        SharedPreferences.Editor seditor = retrive.edit();

        String dy_name = retrive.getString("NAME","");

        Toast.makeText(MainActivity2.this,retrive.getString("NAME","")+retrive.getString("PASSWORD","")
                +"string name"+dy_name,Toast.LENGTH_LONG).show();
        dynamic_name.setText(dy_name);



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preference = getSharedPreferences("SHAREDPREF",MODE_PRIVATE);
                preference.edit().clear().commit();
                Intent n=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(n);
            }
        });
    }
}