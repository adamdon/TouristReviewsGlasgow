/*
 * PROGRAMMER: Adam Don
 * DESCRIPTION: Assessment Task 3, H17W 34 - Developing Small Scale Standalone Applications
 * Date Created: 06.06.2017
 * --------------------------------------
 * Amendments
 * --------------------------------------
 */
package uk.ac.cityofglasgowcollege.gccadamdon;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToMainActivity(View v)
    {
        Intent myIntent = new Intent(Register.this, MainActivity.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeOne(View v)
    {
        Intent myIntent = new Intent(Register.this, HomeOne.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityPlaces(View v)
    {
        Intent myIntent = new Intent(Register.this, Places.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivitySettings(View v)
    {
        Intent myIntent = new Intent(Register.this, Settings.class);
        startActivity(myIntent);
    }

    public void registerNewPerson(View v)
    {
        //try valadates that the details are correct then inputs them into the database
        try {

            EditText txtUsername = (EditText) findViewById(R.id.txtUsername);
            EditText txtPassword = (EditText) findViewById(R.id.txtPassword);
            EditText txtEmail = (EditText) findViewById(R.id.txtEmail);

            String username = txtUsername.getText().toString();
            String password = txtPassword.getText().toString();
            String email = txtEmail.getText().toString();

            Person newPerson = new Person(username, email);
            Login newLogin = new Login(username, password);

            //setup DB Handler
            DBHandler dbHandler = new DBHandler(this);

            //get database
            SQLiteDatabase db = dbHandler.getWritableDatabase();

            //add to database
            dbHandler.addPerson(newPerson, db);
            dbHandler.addLogin(newLogin, db);

            //Display message to confirm that details where added
            if(dbHandler.validateLogin(username, password))
            {
                TextView message = (TextView) findViewById(R.id.lblMessage);
                message.setText("Registered Successfully");
            }
            else
            {
                //gives error message if database error occurs
                TextView message = (TextView) findViewById(R.id.lblMessage);
                message.setText("Something went wrong");
            }


        }
        //gives error message if runtime error occurs
        catch(Exception ex)
        {
            TextView message = (TextView) findViewById(R.id.lblMessage);
            message.setText("Something went wrong");
        }

    }





}
