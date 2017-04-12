package com.example.imarin.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Isaiah Marin on 3/9/2017.
 */

public class FactBook {
    private int mLastRandomNumber = 0;
    private Random mRandomNumberGenerator = new Random();
    private String[] mFacts =
            {
                    "Ants stretch when they wake up in the morning.",
                    "Ostriches can run faster than horses.",
                    "Olympic gold medals are actually made mostly of silver.",
                    "You are born with 300 bones; by the time you are an adult you will have 206.",
                    "It takes about 8 minutes for light from the Sun to reach Earth.",
                    "Some bamboo plants can grow almost a meter in just one day.",
                    "The state of Florida is bigger than England.",
                    "Some penguins can leap 2-3 meters out of the water.",
                    "On average, it takes 66 days to form a new habit.",
                    "Mammoths still walked the earth when the Great Pyramid was being built."
            };
    private int[] mColorList =
            {
                    Color.parseColor("#794044"),
                    Color.parseColor("#0e2f44"),
                    Color.parseColor("#DB7093"),    // PaleVioletRed
                    Color.parseColor("#32CD32"),    // LimeGreen
                    Color.parseColor("#FFA500"),    // Orange
                    Color.parseColor("#87CEFA"),    // LightSkyBlue
                    Color.parseColor("#663399"),    // RebeccaPurple
                    Color.parseColor("#4682B4"),    // SteelBlue
                    Color.parseColor("#DEB887")     // BurlyWood
            };

    public String getFact() {
        return mFacts[getRandomNumber(mFacts.length)];
    }

    public int getBackgroundColor() {
        return mColorList[getRandomNumber(mColorList.length)];
    }

    // Generates a random number between 0 and (number of mFacts).
    private int getRandomNumber(int range) {
        int randomNumber = mRandomNumberGenerator.nextInt(range);

        // Prevents sudden repeats.
        while (randomNumber == mLastRandomNumber) {
            randomNumber = mRandomNumberGenerator.nextInt(range);
        }
        mLastRandomNumber = randomNumber;
        return randomNumber;
    }
}
