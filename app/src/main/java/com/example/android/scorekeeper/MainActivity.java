package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int foulA;
    private int scoresA;
    private int foulB;
    private int scoresB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This part is for Team A
     */

    // increase score by 1
    public void ScoreA(View view) {
        scoresA += 1;
        displayScoreA(scoresA);

    }

    //display score value on screen
    private void displayScoreA(int num) {
        TextView toBeDisplayed = findViewById(R.id.Score_A);
        toBeDisplayed.setText(String.valueOf(scoresA));
    }


    //icrease fauls by 1
    public void FoulsA(View view) {
        foulA += 1;
        displayFoulsA(foulA);
    }

    // display fouls on screen
    private void displayFoulsA(int num) {
        TextView toBeDisplayed = findViewById(R.id.Fouls_A);
        toBeDisplayed.setText(String.valueOf(foulA));
    }


    /**
     * This part is for Team B
     */

    // increase score by 1
    public void ScoreB(View view) {
        scoresB += 1;
        displayScoreB(scoresB);

    }

    //display score on screen
    private void displayScoreB(int num) {
        TextView toBeDisplayed = findViewById(R.id.Score_B);
        toBeDisplayed.setText(String.valueOf(scoresB));
    }


    //increase fouls by 1
    public void FoulsB(View view) {
        foulB += 1;
        displayFoulsB(foulB);
    }

    //display fouls on screen
    private void displayFoulsB(int num) {
        TextView toBeDisplayed = findViewById(R.id.Fouls_B);
        toBeDisplayed.setText(String.valueOf(foulB));
    }


    /**
     * This part is for all--> Reset all values to 0
     */
    public void ResetAll(View view) {
        int allReset = scoresA = scoresB = foulB = foulA = 0;
        displayScoreA(allReset);
        displayFoulsA(allReset);
        displayScoreB(allReset);
        displayFoulsB(allReset);


    }


}
