package com.example.praneethsai.quiz_gdg;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Intent i=getIntent();
        String a=i.getExtras().getString("score");
       FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        fone fo=new fone();
        ft.add(R.id.fonel, fo);
        ft.commit();
    /*   FragmentManager fm1=getFragmentManager();
        FragmentTransaction ft1=fm1.beginTransaction();
        ftwo f2=new ftwo();
        //Fragment fragment =  new Fragment();
        f2.setName(a);
        ft1.add(R.id.ftwol, f2);
        ft1.commit();
        TextView t=(TextView)findViewById(R.id.textView7);*/
      //  Toast.makeText(getApplicationContext(), a, Toast.LENGTH_LONG).show();
       // t.setText("your score is:"+a);
       // ftwo frag = (ftwo)getFragmentManager().findFragmentById(R.id.ftwol);
       // ((TextView) frag.getView().findViewById(R.id.textView7)).setText(a);
        // fragment_obj.updateTextView();
        TextView textView =(TextView)findViewById(R.id.textView8);
        textView.setText("Your score is:"+a);
    }
}
