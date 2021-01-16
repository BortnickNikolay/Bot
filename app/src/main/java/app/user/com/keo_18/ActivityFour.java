package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class ActivityFour extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerFour1;
    Button btnShowAnswerFour2;
    Button btnShowAnswerFour3;
    Button btnShowAnswerFour4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerFour1 = (Button) findViewById(R.id.btnShowAnswerFour1);
        btnShowAnswerFour2 = (Button) findViewById(R.id.btnShowAnswerFour2);
        btnShowAnswerFour3 = (Button) findViewById(R.id.btnShowAnswerFour3);
        btnShowAnswerFour4 = (Button) findViewById(R.id.btnShowAnswerFour4);

        btnShowAnswerFour1.setOnClickListener(this);
        btnShowAnswerFour2.setOnClickListener(this);
        btnShowAnswerFour3.setOnClickListener(this);
        btnShowAnswerFour4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerFour1:
                btnShowAnswerFour1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFive.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerFour2:
                btnShowAnswerFour2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFive.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerFour3:
                btnShowAnswerFour3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFive.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerFour4:
                score = score + 1;
                btnShowAnswerFour4.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityFive.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}