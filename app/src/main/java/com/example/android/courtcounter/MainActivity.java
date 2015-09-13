package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public int score = 0;
    public int scoreb = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3(View view){
        score = score + 3;
        displayForTeamA(score);
    }
    public void plus2(View view){
        score = score + 2;
        displayForTeamA(score);
    }
    public void freethrow(View view){
        score = score + 1;
        displayForTeamA(score);
    }

    //for team B
    public void plus3b(View view){
        scoreb = scoreb + 3;
        displayForTeamB(scoreb);
    }
    public void plus2b(View view){
        scoreb = scoreb + 2;
        displayForTeamB(scoreb);
    }
    public void freethrowb(View view){
        scoreb = scoreb + 1;
        displayForTeamB(scoreb);
    }

    public void reset(View view){
        score=0;
        scoreb=0;
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }
}
