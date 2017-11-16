package io.github.jackfrozr.animan.Hangman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jantzen on 13/11/2017.
 */

public class HangmanDatabase extends SQLiteOpenHelper {
    public final static int VERSION = 10;
    public final static String DATAFILE_NAME = "Hangman.db";
    public final static String TABLE = "Hangman";
    public final static String WORD_ID = "WordId";
    public final static String HINT = "Hint";
    public final static String WORD ="Word";
    public final static String TABLE2 = "Score";
    public final static String ScoreId = "ScoreId";
    public final static String MaxScore = "MaxScore";


    public HangmanDatabase(Context context)
    {
        super(context, DATAFILE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "create table " +TABLE +" ("+WORD_ID+" integer primary key, "+HINT+" text,"+WORD+" text);";
        db.execSQL(sql);
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(1,'The reply you hate to hear','Git Gud');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(2,'I have to stop madoka','homura akemi');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(3,'A _________ Game','Hideo Kojima');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(4,'Female Vampire','Rachel Alucard');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(5,'A classic fantasy Game','Final Fantasy');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(6,'A plague in modern gaming industry','microtransaction');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(7,'Purple Stick','Saints Row');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(8,'Disappointment','Mighty');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(9,'I appear in all classic video game','Bat');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(10,'Finish it!','Fatality');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(11,'A popular horror series','Resident Evil');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(12,'Legendary Figure','AVGN');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(13,'Pew Pew Pew','Call Of Duty');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(14,'Jumping from the highest tower','Leap of Faith');");
        db.execSQL("insert into "+ TABLE+" (WordId,Hint,Word) values(15,'What is your fear?','My Fear Is To Fail');");
        String sql2 = "create table " +TABLE2 +" ("+ScoreId+" integer primary key, "+MaxScore+" integer);";
        db.execSQL(sql2);
        db.execSQL("insert into "+ TABLE2+" (ScoreId,MaxScore) values(1,0);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("drop table if exists "+TABLE);
        db.execSQL("drop table if exists "+TABLE2);
        onCreate(db);
    }
}
