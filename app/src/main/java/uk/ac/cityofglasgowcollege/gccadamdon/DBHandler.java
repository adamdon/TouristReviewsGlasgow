/*
 * PROGRAMMER: Adam Don
 * DESCRIPTION: Assessment Task 3, H17W 34 - Developing Small Scale Standalone Applications
 * Date Created: 06.06.2017
 * --------------------------------------
 * Amendments
 * --------------------------------------
 */

package uk.ac.cityofglasgowcollege.gccadamdon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    //this methods makes the tables in the SQLite database
    @Override
    public void onCreate(SQLiteDatabase db)
    {


        String CREATE_LOGIN_TABLE = "CREATE TABLE Login (Username TEXT PRIMARY KEY, PinNumber TEXT)";
        db.execSQL(CREATE_LOGIN_TABLE);

        String CREATE_PERSON_TABLE = "CREATE TABLE Person (Username TEXT PRIMARY KEY, Email TEXT)";
        db.execSQL(CREATE_PERSON_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
    }

    public DBHandler(Context context)
    {
        //ExampleDB is the name of the database which will be created
        //null is any previous databases    //1 is the version number
        super(context, "ExampleDB", null, 1);
    }

    //Method which allows us to add Logins to the database
    public void addLogin(Login login, SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();
        values.put("Username", login.getUsername());
        values.put("PinNumber", login.getPinNumber());
        db.insert("Login", null, values);
    }

    //Method which allows us to add email details for logins to the database
    public void addPerson(Person person, SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();
        values.put("Username", person.getUsername());
        values.put("Email", person.getEmail());
        db.insert("Person", null, values);
    }



    //Method to make sure that forms are filled out
    public boolean validateLogin(String username, String password)
    {
        //get the database
        SQLiteDatabase db = this.getWritableDatabase();

        //carry out SQL query on username and password from login Table
        //use "cursor" to hold any results - should be 1 if found and 0 if not

        Cursor cursor = db.rawQuery("SELECT * FROM Login WHERE Username = '" + username + "' AND PinNumber = '" + password + "'", null);

        if(cursor.getCount() != 0) //checking to see if there has been any results
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}
