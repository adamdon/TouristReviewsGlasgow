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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeOne(View v)
    {
        Intent myIntent = new Intent(Settings.this, HomeOne.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityPlaces(View v)
    {
        Intent myIntent = new Intent(Settings.this, Places.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivitySettings(View v)
    {
        Intent myIntent = new Intent(Settings.this, Settings.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivitylogin(View v)
    {
        Intent myIntent = new Intent(Settings.this, MainActivity.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityRegister(View v)
    {
        Intent myIntent = new Intent(Settings.this, Register.class);
        startActivity(myIntent);
    }



}
