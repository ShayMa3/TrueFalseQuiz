package com.example.shay.truefalsequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button trueButton, falseButton, nextButton;
    private TextView questionText;
    private List<Question> questionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidget();
        setListeners();
        initQuestionBank();
        //load the first question
        questionText.setText(questionBank.get(0).getQuestionText());
    }

    private void initQuestionBank() {
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.evan_question), true));
        questionBank.add(new Question(getString(R.string.cat_question), false));
        questionBank.add(new Question(getString(R.string.shorr_question), true));
        questionBank.add(new Question(getString(R.string.bush_question), true));
        questionBank.add(new Question(getString(R.string.president_question), false))
    }

    public void setListeners() {
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    private void wireWidget() {
        trueButton = (Button) findViewById(R.id.button_true);
        falseButton = (Button) findViewById(R.id.button_false);
        nextButton = (Button) findViewById(R.id.button_next);
        questionText = (TextView) findViewById(R.id.text_question);
    }

    @Override
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.button_next:
            advanceToNextQuestion();
            break;
        case R.id.button_true:
            checkAnswer(true);
            break;
        case R.id.button_false:
            checkAnswer(false);
            break;

    }
    }

    private void advanceToNextQuestion() {
    }

    private void checkAnswer() {}
}
