package com.example.praneethsai.quiz_gdg;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by praneethsai on 26-04-2016.
 */
public class ftwo extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
// Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.ftwolayout, container, false);
      // TextView t = (TextView) this.getView().findViewbyId(R.id.textView7);
        return v;
      //  return inflater.inflate(R.layout.ftwolayout, container, false);

    }
    public static String name= null;

    public void setName(String string){
        name = string;

        TextView t;
       t = (TextView) getView().findViewById(R.id.textView7);
       t.setText(name);
    }
}
