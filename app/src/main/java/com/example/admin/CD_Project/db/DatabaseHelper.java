package com.example.admin.CD_Project.db;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "store.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "book";
    public static final String COL_ID = "_id";
    public static final String COL_NAMEBOOK = "namebook";
    public static final String COL_NAMEAUTHOR = "nameauthor";
    public static final String COL_NUMPAGE = "numpage";
    public static final String COL_PRICEBOOK = "pricebook";
    public static final String COL_PRICERENT = "pricerent";
    public static final String COL_TYPEBOOK = "typebook";
    public static final String COL_IMAGE = "image";
    public static final String COL_STATUS = "status";

    private static final String SQL_CREATE_TABLE_BOOK
            = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_NAMEBOOK + " TEXT,"
            + COL_NAMEAUTHOR + " TEXT,"
            + COL_NUMPAGE + " TEXT,"
            + COL_PRICEBOOK + " TEXT,"
            + COL_PRICERENT + " TEXT,"
            + COL_TYPEBOOK + " TEXT,"
            + COL_IMAGE + " TEXT,"
            + COL_STATUS + " TEXT"
            + ")";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_TABLE_BOOK);
        ContentValues cv = new ContentValues();

        cv.put(COL_NAMEBOOK, "The Shawshank Redemption");
        cv.put(COL_NAMEAUTHOR, "Frank Darabont");
        cv.put(COL_NUMPAGE, "152");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "9");
        cv.put(COL_TYPEBOOK, "Adventure");
        cv.put(COL_IMAGE, "1.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "The Dark Knight Action");
        cv.put(COL_NAMEAUTHOR, "Frank Darabont");
        cv.put(COL_NUMPAGE, "152");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "9");
        cv.put(COL_TYPEBOOK, "Drama");
        cv.put(COL_IMAGE, "2.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Wall-E");
        cv.put(COL_NAMEAUTHOR, " Andrew Stanton");
        cv.put(COL_NUMPAGE, "98");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "8.4");
        cv.put(COL_TYPEBOOK, "Animation");
        cv.put(COL_IMAGE, "3.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Harry Potter and the Prisoner of Azkaban");
        cv.put(COL_NAMEAUTHOR, " Alfonso Cuarón");
        cv.put(COL_NUMPAGE, "142");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "7.9");
        cv.put(COL_TYPEBOOK, "Adventure");
        cv.put(COL_IMAGE, "4.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Gladiator");
        cv.put(COL_NAMEAUTHOR, "  Ridley Scott");
        cv.put(COL_NUMPAGE, "154");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "8.2");
        cv.put(COL_TYPEBOOK, "Action");
        cv.put(COL_IMAGE, "5.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "The Truman Show");
        cv.put(COL_NAMEAUTHOR, "Peter Weir");
        cv.put(COL_NUMPAGE, "103");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "8.1");
        cv.put(COL_TYPEBOOK, "Comedy");
        cv.put(COL_IMAGE, "6.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Catch Me If You Can");
        cv.put(COL_NAMEAUTHOR, " Steven Spielberg");
        cv.put(COL_NUMPAGE, "141");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "8.1");
        cv.put(COL_TYPEBOOK, "Biography");
        cv.put(COL_IMAGE, "7.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Transformers");
        cv.put(COL_NAMEAUTHOR, " Michael Bay");
        cv.put(COL_NUMPAGE, "144");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "7.1");
        cv.put(COL_TYPEBOOK, "Sci-Fi");
        cv.put(COL_IMAGE, "8.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "The Sixth Sense");
        cv.put(COL_NAMEAUTHOR, "M. Night Shyamalan");
        cv.put(COL_NUMPAGE, "107");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "8.1");
        cv.put(COL_TYPEBOOK, "Thriller");
        cv.put(COL_IMAGE, "9.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Stand By Me");
        cv.put(COL_NAMEAUTHOR, "Rob Reiner");
        cv.put(COL_NUMPAGE, "89");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "8.1");
        cv.put(COL_TYPEBOOK, "Adventure");
        cv.put(COL_IMAGE, "10.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Tangled");
        cv.put(COL_NAMEAUTHOR, " Nathan Greno, Byron Howard");
        cv.put(COL_NUMPAGE, "100");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "7.8");
        cv.put(COL_TYPEBOOK, "Comedy");
        cv.put(COL_IMAGE, "11.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Dumb & Dumbe");
        cv.put(COL_NAMEAUTHOR, " Peter Farrelly, Bobby Farrelly ");
        cv.put(COL_NUMPAGE, "107");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "7.3");
        cv.put(COL_TYPEBOOK, "Comedy");
        cv.put(COL_IMAGE, "12.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Definitely, Maybe");
        cv.put(COL_NAMEAUTHOR, " Adam Brooks");
        cv.put(COL_NUMPAGE, "112");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "7.2");
        cv.put(COL_TYPEBOOK, "Romance");
        cv.put(COL_IMAGE, "13.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Armageddon");
        cv.put(COL_NAMEAUTHOR, " Michael Bay");
        cv.put(COL_NUMPAGE, "151");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "6.7");
        cv.put(COL_TYPEBOOK, "Sci-Fi");
        cv.put(COL_IMAGE, "14.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Shrek");
        cv.put(COL_NAMEAUTHOR, "Andrew Adamson, Vicky Jenson");
        cv.put(COL_NUMPAGE, "90");
        cv.put(COL_PRICEBOOK, "20");
        cv.put(COL_PRICERENT, "7.9");
        cv.put(COL_TYPEBOOK, "Animation");
        cv.put(COL_IMAGE, "15.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Pretty Woman");
        cv.put(COL_NAMEAUTHOR, " Garry Marshall");
        cv.put(COL_NUMPAGE, "119");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.0");
        cv.put(COL_TYPEBOOK, "Comedy");
        cv.put(COL_IMAGE, "16.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);


        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Airdoll");
        cv.put(COL_NAMEAUTHOR, " Hirokazu Koreeda");
        cv.put(COL_NUMPAGE, "125");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "6.9");
        cv.put(COL_TYPEBOOK, "Fantasy");
        cv.put(COL_IMAGE, "17.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "The Impossible");
        cv.put(COL_NAMEAUTHOR, "  J.A. Bayona");
        cv.put(COL_NUMPAGE, "114");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.6");
        cv.put(COL_TYPEBOOK, "History");
        cv.put(COL_IMAGE, "18.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "10 Things I Hate About You");
        cv.put(COL_NAMEAUTHOR, " Gil Junger");
        cv.put(COL_NUMPAGE, "97");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.3");
        cv.put(COL_TYPEBOOK, "Romance");
        cv.put(COL_IMAGE, "19.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Up in the Air");
        cv.put(COL_NAMEAUTHOR, " Jason Reitman");
        cv.put(COL_NUMPAGE, "109");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.4");
        cv.put(COL_TYPEBOOK, "Drama");
        cv.put(COL_IMAGE, "20.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "The Hunt for Red October");
        cv.put(COL_NAMEAUTHOR, "John McTiernan");
        cv.put(COL_NUMPAGE, "135");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.6");
        cv.put(COL_TYPEBOOK, "Thriller");
        cv.put(COL_IMAGE, "21.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Crouching Tiger Hidden Dragon");
        cv.put(COL_NAMEAUTHOR, " Ang Lee");
        cv.put(COL_NUMPAGE, "96");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "6.1");
        cv.put(COL_TYPEBOOK, "Action");
        cv.put(COL_IMAGE, "22.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Looper");
        cv.put(COL_NAMEAUTHOR, "Rian Johnson");
        cv.put(COL_NUMPAGE, "113");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.4");
        cv.put(COL_TYPEBOOK, "Crime");
        cv.put(COL_IMAGE, "23.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Road to Perdition");
        cv.put(COL_NAMEAUTHOR, " Sam Mendes");
        cv.put(COL_NUMPAGE, "117");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.7");
        cv.put(COL_TYPEBOOK, "Thriller");
        cv.put(COL_IMAGE, "24.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "The Insider");
        cv.put(COL_NAMEAUTHOR, " Michael Mann");
        cv.put(COL_NUMPAGE, "157");
        cv.put(COL_PRICEBOOK, "80");
        cv.put(COL_PRICERENT, "7.9");
        cv.put(COL_TYPEBOOK, "Biography");
        cv.put(COL_IMAGE, "25.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Face/Off");
        cv.put(COL_NAMEAUTHOR, " John Woo");
        cv.put(COL_NUMPAGE, "138");
        cv.put(COL_PRICEBOOK, "50");
        cv.put(COL_PRICERENT, "7.3");
        cv.put(COL_TYPEBOOK, "Sci-Fi");
        cv.put(COL_IMAGE, "26.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "What Dreams May Come");
        cv.put(COL_NAMEAUTHOR, " Vincent Ward");
        cv.put(COL_NUMPAGE, "113");
        cv.put(COL_PRICEBOOK, "50");
        cv.put(COL_PRICERENT, "7");
        cv.put(COL_TYPEBOOK, "Fantasy");
        cv.put(COL_IMAGE, "27.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Paprika");
        cv.put(COL_NAMEAUTHOR, " Satoshi Kon");
        cv.put(COL_NUMPAGE, "90");
        cv.put(COL_PRICEBOOK, "50");
        cv.put(COL_PRICERENT, "7.7");
        cv.put(COL_TYPEBOOK, "Adventure");
        cv.put(COL_IMAGE, "28.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Star Trek");
        cv.put(COL_NAMEAUTHOR, "Bryan Fuller, Alex Kurtzman");
        cv.put(COL_NUMPAGE, "90");
        cv.put(COL_PRICEBOOK, "60");
        cv.put(COL_PRICERENT, "7.4");
        cv.put(COL_TYPEBOOK, "Action");
        cv.put(COL_IMAGE, "29.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAMEBOOK, "Cyborg She");
        cv.put(COL_NAMEAUTHOR, " Jae-young Kwak");
        cv.put(COL_NUMPAGE, "115");
        cv.put(COL_PRICEBOOK, "50");
        cv.put(COL_PRICERENT, "7.0");
        cv.put(COL_TYPEBOOK, "Romance");
        cv.put(COL_IMAGE, "30.jpg");
        cv.put(COL_STATUS, "ว่าง");
        db.insert(TABLE_NAME, null, cv);




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
