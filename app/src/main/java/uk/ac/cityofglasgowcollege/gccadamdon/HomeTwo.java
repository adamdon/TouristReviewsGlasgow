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

public class HomeTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_two);
    }


    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeOne(View v)
    {
        Intent myIntent = new Intent(HomeTwo.this, HomeOne.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityPlaces(View v)
    {
        Intent myIntent = new Intent(HomeTwo.this, Places.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivitySettings(View v)
    {
        Intent myIntent = new Intent(HomeTwo.this, Settings.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeTwo(View v)
    {
        Intent myIntent = new Intent(HomeTwo.this, HomeTwo.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeThree(View v)
    {
        Intent myIntent = new Intent(HomeTwo.this, HomeThree.class);
        startActivity(myIntent);
    }

    //Method loads a new Activity when onClick is activated.
    //The Activity loaded is the 2nd parameter passed to "Intent"
    public void goToActivityHomeFour(View v)
    {
        Intent myIntent = new Intent(HomeTwo.this, HomeFour.class);
        startActivity(myIntent);
    }


}
