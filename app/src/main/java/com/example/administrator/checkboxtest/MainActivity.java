package com.example.administrator.checkboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CheckBox> checkBoxList = new ArrayList<CheckBox>();
    int[] check = new int[]{1,2,4,8};
    private CheckBox checkBox_one;
    private CheckBox checkbox_two;
    private CheckBox checkBox_three;
    private CheckBox checkbox_four;
    private Button button;
    private int sum=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox_one = (CheckBox) findViewById(R.id.checkbox_one);
        checkbox_two = (CheckBox) findViewById(R.id.checkbox_two);
        checkBox_three = (CheckBox) findViewById(R.id.checkBox_three);
        checkbox_four = (CheckBox) findViewById(R.id.checkbox_four);
        button = (Button) findViewById(R.id.button);

        checkBoxList.add(checkBox_one);
        checkBoxList.add(checkbox_two);
        checkBoxList.add(checkBox_three);
        checkBoxList.add(checkbox_four);


        for (int i= 0;i<checkBoxList.size();i++){
            if (checkBoxList.get(i).isChecked()){
                sum =sum + check[i];
            }
            Log.i("sum",sum+"-----"+checkBoxList.size()+"-----------"+check[i]);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("sum",sum+"-----"+checkBoxList.size()+"-----------"+check[0]);
                Toast.makeText(MainActivity.this,sum+"",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
