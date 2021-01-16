package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityNine extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerNine1;
    Button btnShowAnswerNine2;
    Button btnShowAnswerNine3;
    Button btnShowAnswerNine4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerNine1 = (Button) findViewById(R.id.btnShowAnswerNine1);
        btnShowAnswerNine2 = (Button) findViewById(R.id.btnShowAnswerNine2);
        btnShowAnswerNine3 = (Button) findViewById(R.id.btnShowAnswerNine3);
        btnShowAnswerNine4 = (Button) findViewById(R.id.btnShowAnswerNine4);

        btnShowAnswerNine1.setOnClickListener(this);
        btnShowAnswerNine2.setOnClickListener(this);
        btnShowAnswerNine3.setOnClickListener(this);
        btnShowAnswerNine4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerNine1:
                score = score + 1;
                btnShowAnswerNine1.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityTen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerNine2:
                btnShowAnswerNine2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityTen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerNine3:
                btnShowAnswerNine3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityTen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerNine4:
                btnShowAnswerNine4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityTen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}