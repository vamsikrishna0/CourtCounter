package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int THREEPOINTER = 3;
    final int TWOPOINTER = 2;
    final int FREETHROW = 1;

    //Team A
    //3 pointer
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + THREEPOINTER;
        displayForTeamA(scoreTeamA);
    }

    //2 pointer
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + TWOPOINTER;
        displayForTeamA(scoreTeamA);
    }

    //free throw
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + FREETHROW;
        displayForTeamA(scoreTeamA);
    }

    //Team B
    //3 pointer
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + THREEPOINTER;
        displayForTeamB(scoreTeamB);
    }

    //2 pointer
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + TWOPOINTER;
        displayForTeamB(scoreTeamB);
    }

    //free throw
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + FREETHROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamB = scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
