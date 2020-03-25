package com.example.quiz;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultant extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8;
    String s11,s22,s33,s44,s55,s66,ans1,ans2,ans3,ans4,ans5,ans6;
    int c=0;
    Bundle b = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultant);
        text1=findViewById(R.id.textView4);
        text2=findViewById(R.id.textView5);
        text3=findViewById(R.id.textView9);
        text4=findViewById(R.id.textView);
        text5=findViewById(R.id.textView7);
        text6=findViewById(R.id.textView8);
        text7=findViewById(R.id.textView12);
        text8=findViewById(R.id.textView10);
        b=getIntent().getExtras();
        s11=b.getString("v1");
        s22=b.getString("v2");
        s33=b.getString("v3");
        s44=b.getString("v4");
        s55=b.getString("v5");
        s66=b.getString("v6");
        ans1="delhi";
        ans2="ram nath kovind";
        ans3="narendra modi";
        ans4="cricket";
        ans5="mahatma gandhi";
        ans6="rupee";
        if(ans1.equalsIgnoreCase(s11))
            c++;
        if(ans2.equalsIgnoreCase(s22))
            c++;
        if(ans3.equalsIgnoreCase(s33))
            c++;
        if(ans4.equalsIgnoreCase(s44))
            c++;
        if(ans5.equalsIgnoreCase(s55))
            c++;
        if(ans6.equalsIgnoreCase(s66))
            c++;

        int k=c;
        String p=String.valueOf(k);

        text1.setText(s11);
        text2.setText(s22);
        text3.setText(s33);
        text4.setText(s44);
        text5.setText(s55);
        text6.setText(s66);
        text7.setText(p);
        text8.setText("YOUR SCORE");
    }
}
