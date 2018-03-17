package com.example.android.scorekeeper;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Team Eagles.
    int scoreTeamEagles = 0;
    //Tracks the score for Team Patriots.
    int scoreTeamPatriots = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);


}


    /**
     * Increases the score for Team Eagles by 6.
     */
    public void addSixForTeamEagles(View v) {
        scoreTeamEagles = scoreTeamEagles + 6;
        displayForTeamEagles(scoreTeamEagles);
    }

    /**
     * Increases the score for Team Eagles by 3.
     */
    public void addThreeForTeamEagles(View v) {
        scoreTeamEagles = scoreTeamEagles + 3;
        displayForTeamEagles(scoreTeamEagles);
    }

    /**
     * Increases the score for Team Eagles by 2.
     */
    public void addTwoForTeamEagles(View v) {
        scoreTeamEagles = scoreTeamEagles + 2;
        displayForTeamEagles(scoreTeamEagles);
    }

    /**
     * Increases the score for Team Eagles by 1.
     */
    public void addOneForTeamEagles(View v) {
        scoreTeamEagles = scoreTeamEagles + 1;
        displayForTeamEagles(scoreTeamEagles);
    }

    /**
     * Increase the score for Team Patriots by 6.
     */

    public void addSixForTeamPatriots(View v) {
        scoreTeamPatriots = scoreTeamPatriots + 6;
        displayForTeamPatriots(scoreTeamPatriots);
    }
    /**
     * Increase the score for Team Patriots by 3.
     */
     public void addThreeForTeamPatriots(View v){
         scoreTeamPatriots =scoreTeamPatriots + 3;
         displayForTeamPatriots(scoreTeamPatriots);

     }
    /**
     * Increase the score for Team Patriots by 2.
     */
    public void addTwoForTeamPatriots(View v){
        scoreTeamPatriots = scoreTeamPatriots + 2;
        displayForTeamPatriots(scoreTeamPatriots);
    }
    /**
     * Increase the score for Team Patriots by 1.
     */
    public void addOneForTeamPatriots(View v){
        scoreTeamPatriots = scoreTeamPatriots + 1;
        displayForTeamPatriots(scoreTeamPatriots);
    }
    public void resetScore(View v){
        scoreTeamEagles = 0;
        scoreTeamPatriots = 0;
        displayForTeamEagles(scoreTeamEagles);
        displayForTeamPatriots(scoreTeamPatriots);
    }
    /**
     * Displays the given score for Team Eagles.
     */
    public void displayForTeamEagles(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_eagles_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team Patriots.
     */
    public void displayForTeamPatriots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_patriots_score);
        scoreView.setText(String.valueOf(score));
    }
}


