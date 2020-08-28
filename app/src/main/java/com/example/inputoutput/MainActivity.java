package com.example.inputoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText theInput;
    private Button theButton;
    private TextView theResponse;
    private Name userName;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theInput = (EditText) findViewById(R.id.inputText);
        theButton = (Button) findViewById(R.id.confirmButton);
        theResponse = (TextView) findViewById(R.id.response);
        text = (TextView) findViewById(R.id.textView);
        userName = new Name();
    }

    public void changeResponse(View v) {
        String input = theInput.getText().toString();
        userName.setUserName(input);
        text.setText(userName.getUserName());
        if (!(userName.getUserName().equals(""))) {
            theResponse.setText("Hello " + userName.getUserName() + userName.randomTerm());
        }
    }
}