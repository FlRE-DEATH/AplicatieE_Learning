package com.example.e_learningapp;

import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class methods extends variables {

    void showToast(String text)
    {
        Toast.makeText(methods.this, text, Toast.LENGTH_SHORT).show();
    }

    void LogIn()
    {
        {

            LogInButton.setOnClickListener
                    (new View.OnClickListener() {
                         @Override
                         public void onClick(View V) {
                             email = EmailText.getText().toString();
                             password = PasswordText.getText().toString();


                             if (email.equals(usermail)&&password.equals(userpass))
                             {
                                 showToast("Welcome");
                                 setContentView(R.layout.lessons_ui);
                             }
                             else
                             {
                                 showToast("Login Failed");
                             }

                         }

                     }
                    );


            //seteaza care layout il va afisa run-ul chestiei...?

        }
    }

}
