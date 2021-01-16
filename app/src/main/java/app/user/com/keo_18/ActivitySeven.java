package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySeven extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerSeven1;
    Button btnShowAnswerSeven2;
    Button btnShowAnswerSeven3;
    Button btnShowAnswerSeven4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerSeven1 = (Button) findViewById(R.id.btnShowAnswerSeven1);
        btnShowAnswerSeven2 = (Button) findViewById(R.id.btnShowAnswerSeven2);
        btnShowAnswerSeven3 = (Button) findViewById(R.id.btnShowAnswerSeven3);
        btnShowAnswerSeven4 = (Button) findViewById(R.id.btnShowAnswerSeven4);

        btnShowAnswerSeven1.setOnClickListener(this);
        btnShowAnswerSeven2.setOnClickListener(this);
        btnShowAnswerSeven3.setOnClickListener(this);
        btnShowAnswerSeven4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerSeven1:
                score = score + 1;
                btnShowAnswerSeven1.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityEight.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerSeven2:
                btnShowAnswerSeven2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityEight.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerSeven3:
                btnShowAnswerSeven3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityEight.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerSeven4:
                btnShowAnswerSeven4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityEight.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}