package com.example.e_learningapp;




import android.os.Bundle;


public class MainActivity extends methods
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   //asta e clasa in care runnuim cam tot codul. gotta figure out how to make more classes and stuff like that
        //so that I don't write all the code here in the main.
        //DE FAPT AR TREBUI SA SCRII IN FUNCTIA onResume !!! e un fel de constructor.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //aici initializez variabile and stuff. poate as putea face asta in alta clasa, iar aici sa dau override doar la onresume.
        //la final cum fac pasii de serializare si persistenta? as in, daca nu vreau ca de fiecare data cand pornesc aplicatia sa am nevoie de initializare
        //pentru ca faza asta ar fi foarte time consuming pentru aplicatii mari.
        //in manifest trebe sa fie declarate toate activitatile.

        EmailText =  findViewById(R.id.email_textInput);
        PasswordText =  findViewById(R.id.password_textInput);

        LogInButton =  findViewById(R.id.login_button);
        //aici fac tranzitia dintre layoutul de login screen si cel de lessons. if-ul e pus la caterinca.
        // Am facut un LogInButton.setOnClickListener si asa merge.
        LogIn();



    } //end OnCreate method

    //acum in layoutul de lessons trebuie sa declar clasa fiecarei materii si sa o fac clickable
    //la randul lor, clasele astea la onclick ma vor conduce la niste layouturi noi, unde ar trebui sa fie lectiile.

    // set on click listener ar fi bine sa fie si el in alte fisiere oare? daca da, cum implementez asta/cum fac functiile respective?





}


