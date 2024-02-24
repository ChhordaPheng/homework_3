package com.app.conntactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactDetails extends AppCompatActivity {
    EditText firstNameEditText;
    EditText lastNameEditText;
    EditText TextPhone;
    EditText Email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        EditText firstNameEditText = (EditText) findViewById(R.id.firstnameEditText);
        EditText lastNameEditText = (EditText) findViewById(R.id.lastnameEditText);
        EditText TextPhone = (EditText) findViewById(R.id.editTextPhone);
        EditText Email = (EditText) findViewById(R.id.editTextTextEmailAddress);

        Button contactBackButton = (Button) findViewById(R.id.backbutton);
        contactBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("firstnameValue", firstNameEditText.getText().toString());
                intent.putExtra("lastnameValue", lastNameEditText.getText().toString());
                intent.putExtra("editTextPhone", TextPhone.getText().toString());
                intent.putExtra("EmailAddress", Email.getText().toString());

                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
    public void onBackPressed (){
        Log.i("Result Detail", "Back Button Pressed");
        firstNameEditText=(EditText) findViewById(R.id.firstnameEditText);
        lastNameEditText=(EditText) findViewById(R.id.lastnameEditText);
        Intent intent=new Intent();
        intent.putExtra("firstnameValue", firstNameEditText.getText().toString());
        intent.putExtra("lastnameValue", lastNameEditText.getText().toString());
        setResult(RESULT_OK, intent);

        super.onBackPressed();

    }
}