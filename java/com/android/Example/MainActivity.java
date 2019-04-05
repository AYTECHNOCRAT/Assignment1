package com.android.Example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out1;
    Button add,sub,mul,div;
    EditText text_1,text_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out1=findViewById(R.id.out_1);
        add=findViewById(R.id.butt_1);
        sub=findViewById(R.id.butt_2);
        mul=findViewById(R.id.butt_3);
        div=findViewById(R.id.butt_4);
        text_1=findViewById(R.id.num_1);
        text_2=findViewById(R.id.num_2);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
      public void onClick (View v)
    {   String str1=text_1.getText().toString();
        String str2=text_2.getText().toString();
        int a= Integer.parseInt(str1);
        int b= Integer.parseInt(str2);
        int c=0;
        switch (v.getId()) {
            case R.id.butt_1:
                c = a + b;
                    break;

            case R.id.butt_2: {
                c =a-b;
                break;
            }
            case R.id.butt_3: {
                c = a * b;
                break;
            }
            case R.id.butt_4: {
                c = a / b;
                break;

            }
            default: break;
        }
        out1.setText(String.valueOf(c));
    }



}
