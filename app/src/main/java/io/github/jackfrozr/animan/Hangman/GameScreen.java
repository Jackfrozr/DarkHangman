package io.github.jackfrozr.animan.Hangman;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import io.github.jackfrozr.animan.R;

public class GameScreen extends AppCompatActivity {

    //Word for the current game
    String game_word;
    //Hint for the current game
    String game_hint;
    //Your current life
    int game_life;
    //Amount of letter guessed correctly
    int game_guessed_correctly;
    SQLiteDatabase db = null;
    int game_score;
    int game_word_length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_game_screen);
        initialize(); // Initialize the variable

        //=====================================================================================//
        // In-app Keyboard for hangman                                                         //
        //=====================================================================================//

        //==========//
        // Button A //
        //==========//

        final Button btnA = (Button)findViewById(R.id.btn_A);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('a',btnA);
            }
        });

        //==========//
        // Button B //
        //==========//

        final Button btnB = (Button)findViewById(R.id.btn_B);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('b',btnB);
            }
        });

        //==========//
        // Button C //
        //==========//

        final Button btnC = (Button)findViewById(R.id.btn_C);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('c',btnC);
            }
        });

        //==========//
        // Button D //
        //==========//

        final Button btnD = (Button)findViewById(R.id.btn_D);
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('d',btnD);
            }
        });

        //==========//
        // Button E //
        //==========//

        final Button btnE = (Button)findViewById(R.id.btn_E);
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('e',btnE);
            }
        });

        //==========//
        // Button F //
        //==========//

        final Button btnF = (Button)findViewById(R.id.btn_F);
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('f',btnF);
            }
        });

        //==========//
        // Button G //
        //==========//

        final Button btnG = (Button)findViewById(R.id.btn_G);
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('g',btnG);
            }
        });

        //==========//
        // Button H //
        //==========//

        final Button btnH = (Button)findViewById(R.id.btn_H);
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('h',btnH);
            }
        });

        //==========//
        // Button I //
        //==========//

        final Button btnI = (Button)findViewById(R.id.btn_I);
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('i',btnI);
            }
        });

        //==========//
        // Button J //
        //==========//

        final Button btnJ = (Button)findViewById(R.id.btn_J);
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('j',btnJ);
            }
        });

        //==========//
        // Button K //
        //==========//

        final Button btnK = (Button)findViewById(R.id.btn_K);
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('k',btnK);
            }
        });

        //==========//
        // Button L //
        //==========//

        final Button btnL = (Button)findViewById(R.id.btn_L);
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('l',btnL);
            }
        });

        //==========//
        // Button M //
        //==========//

        final Button btnM = (Button)findViewById(R.id.btn_M);
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('m',btnM);
            }
        });

        //==========//
        // Button N //
        //==========//

        final Button btnN = (Button)findViewById(R.id.btn_N);
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('n',btnN);
            }
        });

        //==========//
        // Button O //
        //==========//

        final Button btnO = (Button)findViewById(R.id.btn_O);
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('o',btnO);
            }
        });

        final Button btnP = (Button)findViewById(R.id.btn_P);
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('p',btnP);
            }
        });

        final Button btnQ = (Button)findViewById(R.id.btn_Q);
        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('q',btnQ);
            }
        });

        final Button btnR = (Button)findViewById(R.id.btn_R);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('r',btnR);
            }
        });

        final Button btnS = (Button)findViewById(R.id.btn_S);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('s',btnS);
            }
        });

        final Button btnT = (Button)findViewById(R.id.btn_T);
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('t',btnT);
            }
        });

        final Button btnU = (Button)findViewById(R.id.btn_U);
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('u',btnU);
            }
        });

        final Button btnV = (Button)findViewById(R.id.btn_V);
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('v',btnV);
            }
        });

        final Button btnW = (Button)findViewById(R.id.btn_W);
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('w',btnW);
            }
        });

        final Button btnX = (Button)findViewById(R.id.btn_X);
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('x',btnX);
            }
        });

        final Button btnY = (Button)findViewById(R.id.btn_Y);
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('y',btnY);
            }
        });

        final Button btnZ = (Button)findViewById(R.id.btn_z);
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed('z',btnZ);
            }
        });
    }

    //All button pressed on the in-game keyboard are redirected to here
    public void buttonPressed(char letter,Button btn)
    {
        if ( btn.getBackground().getConstantState()!=getResources().getDrawable(R.drawable.keypaddisable).getConstantState())
        {
            //1.Check if there is any life remaining
            if (game_life > 0) {
                //Change Background to show user button is pressed
                btn.setBackgroundResource(R.drawable.keypaddisable);
                //Loop game word length
                int letterfound = 0;
                for (int i = 0; i < game_word.length(); i++) {
                    char temp = game_word.charAt(i);
                    if (temp == letter) {
                        revealIndex(i, letter);
                        letterfound++;
                        game_guessed_correctly++;
                    }
                }

                //If no letter is found reduce health
                if (letterfound == 0) {
                    // If life is greater than 0
                    if (game_life > 0) {
                        game_life--;
                    }
                }
                gameRefresh();
            }

            //GAMEOVER
            // If life is equal to 0
            if (game_life == 0) {

                // get Score from db
                HangmanDatabase helper = new HangmanDatabase(getApplicationContext());
                db = helper.getWritableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM Score Where ScoreId=1", null);
                int score=0;
                while (cursor.moveToNext()) {
                    score = cursor.getInt(1);
                }

                db = helper.getWritableDatabase();
                if (game_score>score) {
                    try {
                        String sql="UPDATE Score SET MaxScore =" + game_score + " WHERE ScoreId=1";
                        System.out.println(sql);
                        db.execSQL(sql);
                        System.out.println("Updated");
                    }
                    catch(Exception e){
                        System.out.println("err updating score");
                    }
                }

                //Game over text
                final TextView txtGameOver = (TextView) findViewById(R.id.txtGameOver);
                final TextView txtGameHint = (TextView) findViewById(R.id.txtHint);
                txtGameOver.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (game_life == 0) {
                            Intent mesg = new Intent();
                            mesg.setClass(GameScreen.this, TitleScreen.class);

                            if (mesg.resolveActivity(getPackageManager()) != null) {

                                startActivity(mesg);
                                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                            }
                        }
                    }
                });
                txtGameOver.setText("You died, Press here to continue");
                txtGameOver.setVisibility(View.VISIBLE);
                txtGameHint.setVisibility(View.INVISIBLE);
                blinkAnimation(100,txtGameOver);
            }
        }
    }

    public void initialize(){
        //Life
        game_life=5;
        game_score=0;
        newGame();
        }

    public void newGame()
    {
        //Hide Text
        TextView txtGameOver = (TextView)findViewById(R.id.txtGameOver);
        txtGameOver.setVisibility(View.INVISIBLE);
        TextView txtVictory = (TextView)findViewById(R.id.txtVictory);
        txtVictory.setVisibility(View.INVISIBLE);

        //Amount of letter guessed correctly
        game_guessed_correctly=0;

        //Hint & Word
        // get word from db
        HangmanDatabase helper = new HangmanDatabase(getApplicationContext());
        db = helper.getWritableDatabase();
        Random rand = new Random();
        int MaxWord=15;
        int randomint =rand.nextInt(MaxWord)+1;
        Cursor cursor = db.rawQuery("SELECT  * FROM " + HangmanDatabase.TABLE + " WHERE WordId ==" +randomint, null);

        int cid;
        String hint="";
        String word="";
        while(cursor.moveToNext()) {
            cid = cursor.getInt(0);
            hint = cursor.getString(1);
            word = cursor.getString(2);
        }
        cursor.close();
        word= word.toLowerCase();
        game_word = word;
        game_hint= hint;

        //Count letter excluding white space
        int count=0;
        for(int i =0;i<game_word.length();i++)
        {
            if(game_word.charAt(i)!=' ')
            {
                count++;
            }
        }
        game_word_length=count;

        //Hint
        TextView txtHint = (TextView)findViewById(R.id.txtHint);
        txtHint.setText(game_hint);
        txtHint.setVisibility(View.VISIBLE);

        //Create the _ _ _ _ for hangman
        TextView txtFeedback = (TextView)findViewById(R.id.txtFeedBack);

        String temp="";
        for(int i=0;i<game_word.length();i++)
        {
            //check for blank space
            if(game_word.charAt(i)==' ')
            {
                temp +="  ";
            }else {
                temp += "_ ";
            }
        }
        txtFeedback.setText(temp);

        buttonRefresh();//Refresh drawable for button
    }

    public void buttonRefresh()
    {
        Button btn = (Button)findViewById(R.id.btn_A);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_B);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_C);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_D);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_E);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_F);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_G);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_H);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_I);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_J);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_K);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_L);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_M);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_N);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_O);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_P);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_Q);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_R);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_S);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_T);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_U);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_V);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_W);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_X);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_Y);
        btn.setBackgroundResource(R.drawable.keypad);
        btn = (Button)findViewById(R.id.btn_z);
        btn.setBackgroundResource(R.drawable.keypad);
    }

    //Refreshes on screen text view
    public void gameRefresh()
    {
        //Lifebar
        lifebarRefresh();

        //Check Victory
        if(game_guessed_correctly==game_word_length)
        {
            game_score+=100;
            String temp = Integer.toString(game_score);
            setScore(temp);

            final TextView txtGameOver = (TextView)findViewById(R.id.txtGameOver);
            final TextView txtGameHint = (TextView)findViewById(R.id.txtHint);
            final TextView txtVictory = (TextView)findViewById(R.id.txtVictory);
            txtGameOver.setText("Tap here to continue");
            txtGameOver.setVisibility(View.VISIBLE);
            txtGameHint.setVisibility(View.INVISIBLE);
            txtVictory.setVisibility(View.VISIBLE);
            txtGameOver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hideGameOverText();
                    newGame();
                }
            });
            fadeIn(1000,txtGameOver);
            fadeIn(50,txtVictory);
        }
    }

    private void blinkAnimation(int offset,TextView myText)
    {
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        anim.setStartOffset(offset);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        myText.startAnimation(anim);
    }

    private void fadeIn(int offset,TextView myText)
    {
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        anim.setStartOffset(offset);
        myText.startAnimation(anim);
    }

    public void hideGameOverText()
    {
        final TextView txtGameOver = (TextView)findViewById(R.id.txtGameOver);
        txtGameOver.setVisibility(View.INVISIBLE);
    }

    public void lifebarRefresh(){
        ImageView imgLife = (ImageView) findViewById(R.id.imgLife);
        if(game_life==4) {
            imgLife.setImageResource(R.drawable.lifebar4);
        }
        if(game_life==3) {
            imgLife.setImageResource(R.drawable.lifebar3);
        }
        if(game_life==2) {
            imgLife.setImageResource(R.drawable.lifebar2);
        }
        if(game_life==1) {
            imgLife.setImageResource(R.drawable.lifebar1);
        }
        if(game_life==0) {
            imgLife.setImageResource(R.drawable.lifebar0);
        }
    }

    public void setScore(String Score){
        TextView txtScore = (TextView)findViewById(R.id.txtScore);
        txtScore.setText(Score);
    }

    public void revealIndex(int index,char letter){
        TextView txtFeedback = (TextView)findViewById(R.id.txtFeedBack);
        String feedback =txtFeedback.getText().toString();


        String NewFeedback="";
        for(int i=0;i<feedback.length();i++)
        {
            //int offset = 1; //Space between letters
            if(i==index*2){
                NewFeedback+=Character.toUpperCase(letter);
            }
            else{
                NewFeedback+=feedback.charAt(i) ;
            }
        }
        txtFeedback.setText(NewFeedback);
    }

}
