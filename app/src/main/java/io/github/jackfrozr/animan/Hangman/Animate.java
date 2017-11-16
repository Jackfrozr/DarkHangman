package io.github.jackfrozr.animan.Hangman;

import android.view.animation.AlphaAnimation;
import android.widget.TextView;

/**
 * Created by Jantzen on 16/11/2017.
 */

//Control all animation

public class Animate {

    public static void blinkAnimation(int offset,TextView myText)
    {
        android.view.animation.Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        anim.setStartOffset(offset);
        anim.setRepeatMode(android.view.animation.Animation.REVERSE);
        anim.setRepeatCount(android.view.animation.Animation.INFINITE);
        myText.startAnimation(anim);
    }

    public static void fadeIn(int offset,TextView myText)
    {
        android.view.animation.Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        anim.setStartOffset(offset);
        myText.startAnimation(anim);
    }
}
