/*
 * PROGRAMMER: Adam Don
 * DESCRIPTION: Assessment Task 3, H17W 34 - Developing Small Scale Standalone Applications
 * Date Created: 06.06.2017
 * --------------------------------------
 * Amendments
 * --------------------------------------
 */
package uk.ac.cityofglasgowcollege.gccadamdon;


// this class defiles the login detalis are class constructor
public class Login {

    private String username;
    private String pinNumber;

    public String getUsername() {return username;}
    public String getPinNumber(){return pinNumber;}

    public void setUsername(String loginUsername){username = loginUsername;}
    public void setPinNumber(String number) {pinNumber = number;}

    public Login()
    {username = "";   pinNumber = "";}

    public Login(String loginUsername, String number)
    {username = loginUsername;  pinNumber = number;}
}
