package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySix extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerSix1;
    Button btnShowAnswerSix2;
    Button btnShowAnswerSix3;
    Button btnShowAnswerSix4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerSix1 = (Button) findViewById(R.id.btnShowAnswerSix1);
        btnShowAnswerSix2 = (Button) findViewById(R.id.btnShowAnswerSix2);
        btnShowAnswerSix3 = (Button) findViewById(R.id.btnShowAnswerSix3);
        btnShowAnswerSix4 = (Button) findViewById(R.id.btnShowAnswerSix4);

        btnShowAnswerSix1.setOnClickListener(this);
        btnShowAnswerSix2.setOnClickListener(this);
        btnShowAnswerSix3.setOnClickListener(this);
        btnShowAnswerSix4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerSix1:
                score = score + 1;
                btnShowAnswerSix1.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivitySeven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerSix2:
                btnShowAnswerSix2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivitySeven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerSix3:
                btnShowAnswerSix3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivitySeven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerSix4:
                btnShowAnswerSix4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivitySeven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}