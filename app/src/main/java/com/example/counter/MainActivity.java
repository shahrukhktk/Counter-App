package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    int Counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textViewCount);

    }

    public void Count(View view)
    {
        Counter = Counter ++;
        textView.setText(""+Counter);
    }

    public void Reset(View view)
    {
        Counter = 0;
        textView.setText(""+Counter);
    }
}
