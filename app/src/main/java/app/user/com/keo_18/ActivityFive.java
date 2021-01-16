package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFive extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerFive1;
    Button btnShowAnswerFive2;
    Button btnShowAnswerFive3;
    Button btnShowAnswerFive4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerFive1 = (Button) findViewById(R.id.btnShowAnswerFive1);
        btnShowAnswerFive2 = (Button) findViewById(R.id.btnShowAnswerFive2);
        btnShowAnswerFive3 = (Button) findViewById(R.id.btnShowAnswerFive3);
        btnShowAnswerFive4 = (Button) findViewById(R.id.btnShowAnswerFive4);

        btnShowAnswerFive1.setOnClickListener(this);
        btnShowAnswerFive2.setOnClickListener(this);
        btnShowAnswerFive3.setOnClickListener(this);
        btnShowAnswerFive4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerFive1:
                btnShowAnswerFive1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivitySix.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerFive2:
                btnShowAnswerFive2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivitySix.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerFive3:
                btnShowAnswerFive3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivitySix.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerFive4:
                score = score + 1;
                btnShowAnswerFive4.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivitySix.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}