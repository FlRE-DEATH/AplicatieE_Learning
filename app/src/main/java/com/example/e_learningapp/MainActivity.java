package com.example.e_learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity<a> extends AppCompatActivity
{
    String email;
    String password;

    EditText EmailText;
    EditText PasswordText;

     Button LogInButton;

     private void showToast(String text)
     {
         Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
     }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailText = (EditText) findViewById(R.id.email_textInput);
        PasswordText = (EditText) findViewById(R.id.password_textInput);

        LogInButton = (Button) findViewById(R.id.login_button);

        LogInButton.setOnClickListener
                (new View.OnClickListener()
                 {
             @Override
             public void onClick(View V)
             {
                email = EmailText.getText().toString();
                password = PasswordText.getText().toString();
                showToast(email);
                showToast(password);
                 setContentView(R.layout.lessons_ui);
             }

                 }
                );


        //seteaza care layout il va afisa run-ul chestiei...?
    }

    //hai sa incerc un if care ma muta din main activity in lessons ui dupa ce apas pe log in
}
