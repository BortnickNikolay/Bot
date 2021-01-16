package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTen extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerTen1;
    Button btnShowAnswerTen2;
    Button btnShowAnswerTen3;
    Button btnShowAnswerTen4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerTen1 = (Button) findViewById(R.id.btnShowAnswerTen1);
        btnShowAnswerTen2 = (Button) findViewById(R.id.btnShowAnswerTen2);
        btnShowAnswerTen3 = (Button) findViewById(R.id.btnShowAnswerTen3);
        btnShowAnswerTen4 = (Button) findViewById(R.id.btnShowAnswerTen4);

        btnShowAnswerTen1.setOnClickListener(this);
        btnShowAnswerTen2.setOnClickListener(this);
        btnShowAnswerTen3.setOnClickListener(this);
        btnShowAnswerTen4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerTen1:
                btnShowAnswerTen1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityEleven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerTen2:
                btnShowAnswerTen2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityEleven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerTen3:
                score = score + 1;
                btnShowAnswerTen3.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityEleven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerTen4:
                btnShowAnswerTen4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityEleven.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}