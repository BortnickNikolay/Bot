package app.user.com.keo_18;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import app.user.com.keo_18.domain.Exam;
import app.user.com.keo_18.domain.Test;

public class ExamActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam);

        Exam exam = ((MyApplication) this.getApplication()).getExam();
        this.handleExam(exam);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;

        Exam exam = ((MyApplication) this.getApplication()).getExam();

        exam.giveTestAnswer(b.getText().toString());

        this.handleExam(exam);
    }

    private void handleExam(Exam exam) {
        if (!exam.hasNext()) {
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        Test currentTest = exam.next();
        this.showTest(currentTest);
    }

    private void showTest(Test test) {
        LinearLayout layoutExam = findViewById(R.id.linearLayoutExam);
        layoutExam.removeAllViews();

        TextView questionView = new TextView(this);
        questionView.setText(test.getQuestion());
        questionView.setTextSize(14 * TypedValue.COMPLEX_UNIT_DIP);
        questionView.setTextColor(Color.BLACK);
        questionView.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.weight = 90;
        questionView.setLayoutParams(lp);

        layoutExam.addView(questionView);

        TextView writeAnswerView = new TextView(this);
        writeAnswerView.setText(this.getResources().getString(R.string.write_answer));
        writeAnswerView.setTextSize(14 * TypedValue.COMPLEX_UNIT_DIP);
        writeAnswerView.setTextColor(Color.BLACK);
        writeAnswerView.setGravity(Gravity.CENTER);

        layoutExam.addView(writeAnswerView);

        for (String answer : test.getAnswers()) {
            Button answerButton = new Button(this);
            answerButton.setText(answer);

            answerButton.setTextSize(14 * TypedValue.COMPLEX_UNIT_DIP);
            answerButton.setTextColor(Color.BLACK);
            answerButton.setGravity(Gravity.CENTER);

            questionView.setLayoutParams(lp);

            answerButton.setOnClickListener(this);

            layoutExam.addView(answerButton);
        }
    }
}
