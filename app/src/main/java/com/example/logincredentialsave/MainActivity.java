package com.example.logincredentialsave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    EditText usr_txt, usr_pass;
    Button button1;

    Intent intent;

    Intent intent3;

    Toast toast;

    Boolean alreadyloged_in =false;
    MainActivity mactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            usr_txt = findViewById(R.id.username);
            usr_pass = findViewById(R.id.password1);
            button1 = findViewById(R.id.b1);

        SharedPreferences retrive = getSharedPreferences("SHAREDPREF",MODE_PRIVATE);
//        SharedPreferences.Editor retriveditor = retrive.edit();
        String ret_f_name = retrive.getString("NAME",null);
        String ret_l_name = retrive.getString("PASSWORD",null);





        if(ret_f_name != null && ret_l_name != null){
            intent3 = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intent3);

        }



            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String txt_string = usr_txt.getText().toString();
                    String pass_string = usr_pass.getText().toString();


//                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(//using getcontext());
                sharedPreferences = getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor inserteditor = sharedPreferences.edit();
                inserteditor.putString("NAME",txt_string);
                inserteditor.putString("PASSWORD",pass_string);

                inserteditor.commit();
                    alreadyloged_in = true;
                intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);


                }
                 });





             }

        }

