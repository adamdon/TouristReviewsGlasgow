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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeOne(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, HomeOne.class);
        startActivity(myIntent);
    }


    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityPlaces(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, Places.class);
        startActivity(myIntent);
    }


    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivitySettings(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, Settings.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityRegister(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, Register.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivitySplashScreen(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, splashScreen.class);
        startActivity(myIntent);
    }

    //This method is ran when the login button is clicked to setup, get then populate database
    public void login(View v)
    {
        EditText txtUsername = (EditText) findViewById(R.id.txtUsername);
        EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();


        //setup DB Handler
        DBHandler dbHandler = new DBHandler(this);

        //get database
        SQLiteDatabase db = dbHandler.getReadableDatabase();

        //check if username and password are in the db
        if(dbHandler.validateLogin(username, password))
        {
            TextView message = (TextView) findViewById(R.id.lblMessage);
            message.setText("Logged in successfully");
        }
        else
        {
            TextView message = (TextView) findViewById(R.id.lblMessage);
            message.setText("Unsuccessful login");
        }
    }

}
