package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEleven extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerEleven1;
    Button btnShowAnswerEleven2;
    Button btnShowAnswerEleven3;
    Button btnShowAnswerEleven4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerEleven1 = (Button) findViewById(R.id.btnShowAnswerEleven1);
        btnShowAnswerEleven2 = (Button) findViewById(R.id.btnShowAnswerEleven2);
        btnShowAnswerEleven3 = (Button) findViewById(R.id.btnShowAnswerEleven3);
        btnShowAnswerEleven4 = (Button) findViewById(R.id.btnShowAnswerEleven4);

        btnShowAnswerEleven1.setOnClickListener(this);
        btnShowAnswerEleven2.setOnClickListener(this);
        btnShowAnswerEleven3.setOnClickListener(this);
        btnShowAnswerEleven4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerEleven1:
                btnShowAnswerEleven1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityTwelve.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerEleven2:
                btnShowAnswerEleven2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityTwelve.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerEleven3:
                btnShowAnswerEleven3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityTwelve.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerEleven4:
                score = score + 1;
                btnShowAnswerEleven4.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityTwelve.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}