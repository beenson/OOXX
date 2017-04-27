package com.example.beenson.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
int j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);
//        for(int i = 1;i<=9;i++) {
//            for(int j = 1;j <=9;j++) {
//                TextView txt = new TextView(this);
//                txt.setText(i + " X " + j + " = " + i*j);
//                txt.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
//                LinearLayout.LayoutParams layout_966 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//                int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5, getResources().getDisplayMetrics());
//                layout_966.setMargins(pixels, pixels, pixels, pixels);
//                txt.setLayoutParams(layout_966);
//                linearLayout.addView(txt);
//
//                Log.d("output", i + " X " + j + " = " + i*j);
//            }
//        }

        ArrayList<TextView> txtGrids = new ArrayList<>();
        for(int i=1;i<10;i++){
            TextView txtTemp = (TextView) findViewById(getResources().getIdentifier("grid"+i,"id",getPackageName()));
            txtGrids.add(txtTemp);
        }

        for(int i=0;i<txtGrids.size();i++){
            txtGrids.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((TextView)v).setText(j);
                    j++;
              }
            });
        }


    }
}
