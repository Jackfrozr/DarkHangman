package io.github.jackfrozr.animan.Hangman;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

import io.github.jackfrozr.animan.R;

public class TitleScreen extends AppCompatActivity
{
    SQLiteDatabase db = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_title_screen);

        //Load Database
        loadDatabase();

        //Constrain Layout onClick
        RelativeLayout cLay = (RelativeLayout)findViewById(R.id.clay);
        onClick(cLay);

        //Blink Animation for textview
        TextView myText = (TextView) findViewById(R.id.txtStart );
        blinkAnimation(myText);

    }

    private void loadDatabase()
    {
        //Retrieve High score from database
        int score = 0;
        try {
            HangmanDatabase helper = new HangmanDatabase(getApplicationContext());
            db = helper.getWritableDatabase();
            Cursor cursor = db.rawQuery("SELECT * FROM Score Where ScoreId=1", null);

            while (cursor.moveToNext()) {
                score = cursor.getInt(1);

            }
            cursor.close();
        }
        catch (Exception e)
        {
            System.err.println("Problem retrieving score");
        }

        final TextView txtScore = (TextView) findViewById(R.id.txtMaxScore);
        String mesg = Integer.toString(score);
        txtScore.setText("High Score: "+mesg);
    }

    private void blinkAnimation(TextView myText)
    {
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000); //You can manage the blinking time with this parameter
        anim.setStartOffset(50);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        myText.startAnimation(anim);
    }

    private void onClick(RelativeLayout cLay)
    {
        cLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesg = new Intent();
                mesg.setClass(TitleScreen.this, GameScreen.class);

                if (mesg.resolveActivity(getPackageManager()) != null) {

                    startActivity(mesg);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
            }
        });
    }

}



