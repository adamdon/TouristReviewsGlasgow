/*
 * PROGRAMMER: Adam Don
 * DESCRIPTION: Assessment Task 3, H17W 34 - Developing Small Scale Standalone Applications
 * Date Created: 06.06.2017
 * --------------------------------------
 * Amendments
 * --------------------------------------
 */
package uk.ac.cityofglasgowcollege.gccadamdon;


// this class defiles the person detalis are class constructor
public class Person {

    private String username;
    private String email;

    public String getUsername(){return username;}
    public String getEmail(){return email;}

    public void setUsername(String uname){username = uname;}
    public void setEmail(String personEmail){email = personEmail;}

    public Person()
    {username = "";     email ="";};

    public Person(String uname, String personEmail)
    {username = uname;  email = personEmail;}

}
