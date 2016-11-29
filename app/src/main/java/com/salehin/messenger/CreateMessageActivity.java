package com.salehin.messenger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    @Override

    //onCreate() method gets called when the activity is created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message_linear);
    }

    //Call onSendMessage() when the button is clicked
    public void OnSendMessage(View view) {
        //Get a reference to the EditText
        EditText setMessage = (EditText) findViewById(R.id.setMessage);
        //Get a reference to the TextView
        TextView getMessage = (TextView) findViewById(R.id.showMessage);

        //Get the text from the editable text field with an Id of setMessage
        String messageText = setMessage.getText().toString();

        //Display text in TextView
        getMessage.setText(messageText);

        //************* EXPLICIT INTENT ***********************************************************************
        //Specify the target activity we want to receive the intent
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);

        //Add the text message to the intent. By using a constant name for the name of the extra information,
        // we know that both activity are using the same string.
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        //*****************************************************************************************************


        //************* IMPLICIT INTENT ***********************************************************************

        //These attribute is related to Intent.ACTION_SEND, each action have their own attribute.
        // Refer here: https://developer.android.com/reference/android/content/Intent.html
        //Intent intent = new Intent(Intent.ACTION_SEND);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT, messageText);
        //*****************************************************************************************************

        //startActivity(intent);


    }
}
