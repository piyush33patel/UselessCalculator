package com.example.uselesscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText operation = (EditText)findViewById(R.id.operation);
        EditText input = (EditText)findViewById(R.id.array);
        Button execute = (Button)findViewById(R.id.button);
        TextView result = (TextView)findViewById(R.id.result);
        execute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String array[] = input.getText().toString().split(",");
                int ans = Integer.valueOf(array[0]);
                for(int i = 1; i < array.length; i++){
                    ans ^= Integer.valueOf(array[i]);
                }
                result.setText(ans+"");
            }
        });
    }
}