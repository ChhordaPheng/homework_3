package com.app.conntactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button getContactButton = (Button) findViewById(R.id.getcontactbutton);
        getContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ContactDetails.class);
//                startActivity(intent);
                startActivityForResult(intent,1);
            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        TextView contactTextView= (TextView) findViewById(R.id.contacttextView);
        if (requestCode==1){
            if(resultCode== RESULT_OK){
                String strGetContact = data.getStringExtra("lastnameValue")+" "+data.getStringExtra("firstnameValue")+"\n"+data.getStringExtra("editTextPhone")+"\n"+data.getStringExtra("EmailAddress");

                contactTextView.setText(strGetContact);
            }
        }

    }
}