package com.example.praneethsai.quiz_gdg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String ans1,ans2,ans3;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3=(Button)findViewById(R.id.button3);

        SharedPreferences p=getApplicationContext().getSharedPreferences("my", MODE_PRIVATE);
//        SharedPreferences.Editor e=p.edit();
        String un=p.getString("un", null);
        TextView t=(TextView)findViewById(R.id.textView2);

        t.setText("welcome "+un);
        Toast.makeText(getApplicationContext(),"start your quiz",Toast.LENGTH_LONG).show();
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("clicked", "clicked");
                SharedPreferences preferences=getSharedPreferences("my", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                editor.clear();
                editor.commit();

                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void submit(View v)
    {
        int count=0;
        RadioGroup r1,r2,r3;
        r1=(RadioGroup)findViewById(R.id.rg1);
        r2=(RadioGroup)findViewById(R.id.rg2);
        r3=(RadioGroup)findViewById(R.id.rg3);
        int a1=r1.getCheckedRadioButtonId();
        int a2=r2.getCheckedRadioButtonId();
        int a3=r3.getCheckedRadioButtonId();
        RadioButton rb1,rb2,rb3;
        rb1=(RadioButton)findViewById(a1);
        rb2=(RadioButton)findViewById(a2);
        rb3=(RadioButton)findViewById(a3);

        ans1=rb1.getText().toString();
        ans2=rb2.getText().toString();
        ans3=rb3.getText().toString();
if(ans1.equals("Prince"))
    count++;
        if(ans2.equals("Sundar Pichai"))
            count++;
        if(ans3.equals("Larry page and Sergey Brin"))
            count++;
        String a=count+"";
        Intent i=new Intent(this,Main22Activity.class);
        i.putExtra("score",a);

        startActivity(i);


    }
    public void Logout(View v)
    {
        Log.v("clicked", "clicked");
        SharedPreferences preferences=getSharedPreferences("my", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.remove("un");

        Intent intent=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }


}
