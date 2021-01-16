package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityThree extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerThree1;
    Button btnShowAnswerThree2;
    Button btnShowAnswerThree3;
    Button btnShowAnswerThree4;
    int score = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        btnShowAnswerThree1 = (Button) findViewById(R.id.btnShowAnswerThree1);
        btnShowAnswerThree2 = (Button) findViewById(R.id.btnShowAnswerThree2);
        btnShowAnswerThree3 = (Button) findViewById(R.id.btnShowAnswerThree3);
        btnShowAnswerThree4 = (Button) findViewById(R.id.btnShowAnswerThree4);

        btnShowAnswerThree1.setOnClickListener(this);
        btnShowAnswerThree2.setOnClickListener(this);
        btnShowAnswerThree3.setOnClickListener(this);
        btnShowAnswerThree4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerThree1:
                btnShowAnswerThree1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFour.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerThree2:
                score = score + 1;
                btnShowAnswerThree2.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityFour.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerThree3:
                btnShowAnswerThree3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFour.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
        case R.id.btnShowAnswerThree4:
                btnShowAnswerThree4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFour.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}