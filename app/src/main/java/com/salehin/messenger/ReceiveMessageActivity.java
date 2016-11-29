package com.salehin.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    //name of extra information/value we're passing in the intent
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        //Get the Intent
        Intent intent = getIntent();
        //Get the message from intent using getStringExtra()
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        //Get a reference to the TextView
        TextView messageView = (TextView) findViewById(R.id.messageView);
        //Add the text to the message text view.
        messageView.setText(messageText);

    }
}
