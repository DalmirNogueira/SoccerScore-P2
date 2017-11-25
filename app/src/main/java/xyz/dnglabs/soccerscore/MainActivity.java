package xyz.dnglabs.soccerscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalHome(0);
        displayGoalAway(0);
        displayYellowHome(0);
        displayYellowAway(0);
        displayRedHome(0);
        displayRedAway(0);

    }

    int numberGoalsHome = 0;
    int numberGoalsAway = 0;
    int numberYellowCardHome = 0;
    int numberYellowCardAway = 0;
    int numberRedCardHome = 0;
    int numberRedCardAway = 0;

    public void plusGoalHome(View view) {
        numberGoalsHome = numberGoalsHome + 1;
        displayGoalHome(numberGoalsHome);
    }

    private void displayGoalHome(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textGoalsHome);
        quantityTextView.setText("" + number);

    }

    public void plusGoalAway(View view) {
        numberGoalsAway = numberGoalsAway + 1;
        displayGoalAway(numberGoalsAway);
    }

    private void displayGoalAway(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textGoalsAway);
        quantityTextView.setText("" + number);

    }

    public void plusYellowCardHome(View view){
        numberYellowCardHome = numberYellowCardHome +1;
        displayYellowHome(numberYellowCardHome);
    }

    private void displayYellowHome(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textYellowCardHome);
        quantityTextView.setText("" + number);

    }

    public void plusYellowCardAway(View view){
        numberYellowCardAway = numberYellowCardAway +1;
        displayYellowAway(numberYellowCardAway);
    }

    private void displayYellowAway(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textYellowCardAway);
        quantityTextView.setText("" + number);

    }

    public void plusRedCardHome(View view){
        numberRedCardHome = numberRedCardHome +1;
        displayRedHome(numberRedCardHome);
    }

    private void displayRedHome(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textRedCardHome);
        quantityTextView.setText("" + number);

    }

    public void plusRedCardAway(View view){
        numberRedCardAway = numberRedCardAway +1;
        displayRedAway(numberRedCardAway);
    }

    private void displayRedAway(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textRedCardAway);
        quantityTextView.setText("" + number);

    }

    public void resetScore(View view){
        numberGoalsHome = 0;
        numberGoalsAway = 0;
        numberYellowCardHome = 0;
        numberYellowCardAway = 0;
        numberRedCardHome = 0;
        numberRedCardAway = 0;
        displayGoalHome(numberGoalsHome);
        displayGoalAway(numberGoalsAway);
        displayYellowHome(numberYellowCardHome);
        displayYellowAway(numberYellowCardAway);
        displayRedHome(numberRedCardHome);
        displayRedAway(numberRedCardAway);
    }

}
