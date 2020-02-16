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

    String usermail="a";
    String userpass="b";

    EditText EmailText;
    EditText PasswordText;

     Button LogInButton;

     private void showToast(String text)
     {
         Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
     }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   //asta e clasa in care runnuim cam tot codul. gotta figure out how to make more classes and stuff like that
        //so that I don't write all the code here in the main.
        //DE FAPT AR TREBUI SA SCRII IN FUNCTIA onResume !!!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailText =  findViewById(R.id.email_textInput);
        PasswordText =  findViewById(R.id.password_textInput);

        LogInButton =  findViewById(R.id.login_button);
        //aici fac tranzitia dintre layoutul de login screen si cel de lessons. if-ul e pus la caterinca.
        // Am facut un LogInButton.setOnClickListener si asa merge.
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
    } //end OnCreate method

    //acum in layoutul de lessons trebuie sa declar clasa fiecarei materii si sa o fac clickable
    //la randul lor, clasele astea la onclick ma vor conduce la niste layouturi noi, unde ar trebui sa fie lectiile.
    //BUT FIRST let's experiment with adding new files to make all the declarations there to have a cleaner main.
    // set on click listener ar fi bine sa fie si el in alte fisiere oare? daca da, cum implementez asta/cum fac functiile respective?
}
