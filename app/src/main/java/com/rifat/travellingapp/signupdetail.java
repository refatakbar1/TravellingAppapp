package com.rifat.travellingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signupdetail extends AppCompatActivity {
    private EditText editText_name;
    private EditText editText_email;
    private EditText editText_phone;
    private Button button2_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupdetail);
        editText_name=(EditText)findViewById(R.id.editText_name);
        editText_email=(EditText)findViewById(R.id.editText_email);
        editText_phone=(EditText)findViewById(R.id.editText_phone);
        button2_save=(Button)findViewById(R.id.button2_save);
        button2_save.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                saveSignup();

            }
        });
    }

    private void saveSignup() {
        DBHelper db=new DBHelper(this);
        SignUp signup=new SignUp();
        signup.setName(editText_name.getText().toString());
        signup.setEmail(editText_email.getText().toString());
        signup.setPhone(editText_phone.getText().toString());
        db.insertContact(signup);
        finish();


    }

}
