package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.annotation.Target;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);

        EditText messageEdit = findViewById(R.id.message);

        String message = messageEdit.getText().toString();
        String chooserTitle = getString(R.string.chooser);

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }

}