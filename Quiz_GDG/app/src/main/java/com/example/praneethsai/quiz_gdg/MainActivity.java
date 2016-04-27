package com.example.praneethsai.quiz_gdg;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences p = getApplicationContext().getSharedPreferences("my", MODE_PRIVATE);

        if (TextUtils.isEmpty(p.getString("un", null))) {
            setContentView(R.layout.activity_main);
            e1 = (EditText) findViewById(R.id.editText);
            e2 = (EditText) findViewById(R.id.editText2);

        }
        else
        {


            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    }
    public void login(View v)
    {

        SharedPreferences p=getApplicationContext().getSharedPreferences("my",MODE_PRIVATE);
        SharedPreferences.Editor e=p.edit();
        String un=e1.getText().toString();
        String pwd=e2.getText().toString();
        e.putString("un", un);
       // e.putString("pwd", pwd);
        e.commit();

        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }

}
