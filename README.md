# TouristReviewsGlasgow
### Android App with MySql login

 - [Download .apk](https://github.com/adamdon/TouristReviewsGlasgow/releases/download/1.0.0/app-debug.apk)
 
![Screenshot of UI](https://adamdon.github.io/img/TouristReviewsGlasgow_screenshot01.png)

I developed this project prior to university to implement a Database within an Android app. The UI was kept at a prototype stage using XML to position the layout, the DBHandler Class was used for CRUD functions and a database was created with SQLite.

```markdown
public void onCreate(SQLiteDatabase db)
{
    String CREATE_LOGIN_TABLE = "CREATE TABLE Login (Username TEXT PRIMARY KEY, PinNumber TEXT)";
    db.execSQL(CREATE_LOGIN_TABLE);

    String CREATE_PERSON_TABLE = "CREATE TABLE Person (Username TEXT PRIMARY KEY, Email TEXT)";
    db.execSQL(CREATE_PERSON_TABLE);
}

public void addLogin(Login login, SQLiteDatabase db)
{
    ContentValues values = new ContentValues();
    values.put("Username", login.getUsername());
    values.put("PinNumber", login.getPinNumber());
    db.insert("Login", null, values);
}

```
 - [View Full Source (github)](https://github.com/adamdon/TouristReviewsGlasgow/tree/master/app/src/main/java/uk/ac/cityofglasgowcollege/gccadamdon)
