package com.example.android.randaquiz;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EnglishActivity extends AppCompatActivity {



    // Declaration of global variables.
    int score = 0, scoreTwo =0, scoreThree = 0, scoreFour = 0, scoreFive = 0;

    //Beginning of the onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


    }//end of onCreate

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            // Beginning question 1
            case R.id.button_1a:
                if (checked)
                    score = 0;
                break;

            case R.id.button_1b:
                if (checked)
                    score = 0;
                break;

            case R.id.button_1c:
                if (checked)
                    score += 1;
                break;

            case R.id.button_1d:
                if (checked)
                    score = 0;
                break;
            //End of question 1

            //Beginning of question 2
            case R.id.button_2a:
                if (checked)
                    scoreTwo += 1;
                break;

            case R.id.button_2b:
                if (checked)
                    scoreTwo = 0;
                break;

            case R.id.button_2c:
                if (checked)
                    scoreTwo = 0;
                break;

            case R.id.button_2d:
                if (checked)
                    scoreTwo = 0;
                break;
            //End of question 2

            //Beginning of question 3
            case R.id.button_3a:
                if (checked)
                    scoreThree += 0;
                break;

            case R.id.button_3b:
                if (checked)
                    scoreThree += 1;
                break;

            case R.id.button_3c:
                if (checked)
                    scoreThree = 0;
                break;

            case R.id.button_3d:
                if (checked)
                    scoreThree = 0;
                break;
            //End of question 3

            //Beginning of question 4
            case R.id.button_4a:
                if (checked)
                    scoreFour += 0;
                break;

            case R.id.button_4b:
                if (checked)
                    scoreFour += 1;
                break;

            case R.id.button_4c:
                if (checked)
                    scoreFour = 0;
                break;

            case R.id.button_4d:
                if (checked)
                    scoreFour = 0;
                break;
            //End of question 4

                        //Beginning of question 5
            case R.id.button_5a:
                if (checked)
                    scoreFive += 0;
                break;

            case R.id.button_5b:
                if (checked)
                    scoreFive = 0;
                break;

            case R.id.button_5c:
                if (checked)
                    scoreFive += 1;
                break;

            case R.id.button_5d:
                if (checked)
                    scoreFive = 0;
                break;
            //End of question 5
        }
    }







    private void questionOne(){
        RadioButton buttonOne = findViewById(R.id.button_1c);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_1a);
        RadioButton buttonThree = findViewById(R.id.button_1b);
        RadioButton buttonFour = findViewById(R.id.button_1d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answerEnglish1);
            ans1.setText(getResources().getString(R.string.ansEnglish1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answerEnglish1);
            ans1.setText(getResources().getString(R.string.ansEnglish1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answerEnglish1);
            ans1.setText(getResources().getString(R.string.ansEnglish1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionTwo(){
        RadioButton buttonOne = findViewById(R.id.button_2a);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_2b);
        RadioButton buttonThree = findViewById(R.id.button_2c);
        RadioButton buttonFour = findViewById(R.id.button_2d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answerEnglish2);
            ans2.setText(getResources().getString(R.string.ansEnglish2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answerEnglish2);
            ans2.setText(getResources().getString(R.string.ansEnglish2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answerEnglish2);
            ans2.setText(getResources().getString(R.string.ansEnglish2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionThree(){
        RadioButton buttonOne = findViewById(R.id.button_3b);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_3a);
        RadioButton buttonThree = findViewById(R.id.button_3c);
        RadioButton buttonFour = findViewById(R.id.button_3d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answerEnglish3);
            ans3.setText(getResources().getString(R.string.ansEnglish3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answerEnglish3);
            ans3.setText(getResources().getString(R.string.ansEnglish3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answerEnglish3);
            ans3.setText(getResources().getString(R.string.ansEnglish3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionFour(){
        RadioButton buttonOne = findViewById(R.id.button_4b);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_4a);
        RadioButton buttonThree = findViewById(R.id.button_4c);
        RadioButton buttonFour = findViewById(R.id.button_4d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answerEnglish4);
            ans4.setText(getResources().getString(R.string.ansEnglish4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answerEnglish4);
            ans4.setText(getResources().getString(R.string.ansEnglish4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answerEnglish4);
            ans4.setText(getResources().getString(R.string.ansEnglish4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }



    private void questionFive(){
        RadioButton buttonOne = findViewById(R.id.button_5a);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_5b);
        RadioButton buttonThree = findViewById(R.id.button_5c);
        RadioButton buttonFour = findViewById(R.id.button_5d);

        if (buttonOne.isChecked()){
            buttonOne.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answerEnglish4);
            ans4.setText(getResources().getString(R.string.ansEnglish4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answerEnglish4);
            ans4.setText(getResources().getString(R.string.ansEnglish4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answerEnglish4);
            ans4.setText(getResources().getString(R.string.ansEnglish4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }




    public void submitButton(View view){
        //errors
        RadioGroup rg1 = findViewById(R.id.rg1);
        RadioGroup rg2 = findViewById(R.id.rg2);
        RadioGroup rg3 = findViewById(R.id.rg3);
        RadioGroup rg4 = findViewById(R.id.rg4);
        RadioGroup rg5 = findViewById(R.id.rg5);

        if(rg1.getCheckedRadioButtonId() == -1){
            //if no RadioButton is checked
            Toast.makeText(this, "Question 1 is not answered", Toast.LENGTH_SHORT).show();

        }else if(rg2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 2 is not answered", Toast.LENGTH_SHORT).show();

        }else if(rg3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 3 is not answered", Toast.LENGTH_SHORT).show();

        }else if (rg4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 4 is not answered", Toast.LENGTH_SHORT).show();

        } else if (rg4.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question % is not answered", Toast.LENGTH_SHORT).show();
        }else {
            //if at least one RadioButton is not empty
            questionOne();
            questionTwo();
            questionThree();
            questionFour();
            questionFive();


            int totalScore = score + scoreTwo + scoreThree + scoreFour + scoreFive;
            // Toast messages after taking the quizzes.
            if (totalScore <= 4){
                Toast.makeText(this, "Below Average. Try Harder Next Time!", Toast.LENGTH_SHORT).show();
            }else if (totalScore == 5 || totalScore == 6 || totalScore == 7){
                Toast.makeText(this, "Good Result, you can still do better!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Excellent result, do not relent!", Toast.LENGTH_SHORT).show();
            }

            //TextView
            TextView results = findViewById(R.id.results);
            results.setText(getResources().getString(R.string.results, totalScore));
            results.setVisibility(View.VISIBLE);

            // Status Buttons Buttons after the submit button is clicked.
            Button next = findViewById(R.id.next_button);
            next.setVisibility(View.VISIBLE);
            Button previous = findViewById(R.id.previous_button);
            previous.setVisibility(View.VISIBLE);
            Button submit = findViewById(R.id.submit_button);
            submit.setVisibility(View.INVISIBLE);
        }
    }

    public void nextPage(View view){
        startActivity(new Intent(this, ChemistryActivity.class));
    }
    public void previousPage(View view) {
        startActivity(new Intent(this, MathematicsActivity.class));
    }

}//end of public class
