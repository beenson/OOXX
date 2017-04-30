package com.example.beenson.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int j = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<TextView> txtGrids = new ArrayList<>();
        ArrayList<TextView> OOXX = new ArrayList<>();
        for(int i=1;i<10;i++){
            TextView txtTemp = (TextView) findViewById(getResources().getIdentifier("grid"+i,"id",getPackageName()));
            txtGrids.add(txtTemp);
        }

        for(int i=0;i<txtGrids.size();i++){
            txtGrids.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if((j % 2 == 0) && (((TextView) v).getText() == "")) {
                        ((TextView) v).setText("O");
                    }
                    else if (((TextView) v).getText() == "") {
                        ((TextView) v).setText("X");
                    }

                    j++;
                }
            });
        }
    }
}
