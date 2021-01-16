package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEight extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerEight1;
    Button btnShowAnswerEight2;
    Button btnShowAnswerEight3;
    Button btnShowAnswerEight4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerEight1 = (Button) findViewById(R.id.btnShowAnswerEight1);
        btnShowAnswerEight2 = (Button) findViewById(R.id.btnShowAnswerEight2);
        btnShowAnswerEight3 = (Button) findViewById(R.id.btnShowAnswerEight3);
        btnShowAnswerEight4 = (Button) findViewById(R.id.btnShowAnswerEight4);

        btnShowAnswerEight1.setOnClickListener(this);
        btnShowAnswerEight2.setOnClickListener(this);
        btnShowAnswerEight3.setOnClickListener(this);
        btnShowAnswerEight4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerEight1:
                btnShowAnswerEight1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityNine.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerEight2:
                score = score + 1;
                btnShowAnswerEight2.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityNine.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerEight3:
                btnShowAnswerEight3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityNine.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerEight4:
                btnShowAnswerEight4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityNine.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}