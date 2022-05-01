//Create a button, in clicking the button text is changed. 
package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        textview = findViewById(R.id.txt);
        //There are two methods of event listener. click listener is given below
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("CLICKED!");
            }
        });*/
    }
    //This function is explicitly set in onclick attribute of event or .xml file as well.
    public void writeText(View view) {
        textview.setText("I am clicked!");
    }
}
