package com.example.demotimetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_generate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TextView tv1 = (TextView) findViewById(R.id.m_9);
                TextView tv2 = (TextView) findViewById(R.id.m_10);
                TextView tv3 = (TextView) findViewById(R.id.m_11);
                TextView tv4 = (TextView) findViewById(R.id.m_12);
                TextView tv5 = (TextView) findViewById(R.id.t_9);
                TextView tv6 = (TextView) findViewById(R.id.t_10);
                TextView tv7 = (TextView) findViewById(R.id.t_ll);
                TextView tv8 = (TextView) findViewById(R.id.t_12);
                TextView tv9 = (TextView) findViewById(R.id.w_9);
                TextView tv10 = (TextView) findViewById(R.id.w_10);
                TextView tv11 = (TextView) findViewById(R.id.w_11);
                TextView tv12 = (TextView) findViewById(R.id.w_12);
                tv1.setText("IS1234");
                tv2.setText("na");
                tv3.setText("IS2345");

                tv4.setText("na");
                tv5.setText("IS3456");
                tv6.setText("na");
                tv7.setText("IS6789");
                tv8.setText("na");
                tv9.setText("IS2234");
                tv10.setText("na");
                tv11.setText("IS3234");
                tv12.setText("na");






            }
        });
    }
}
