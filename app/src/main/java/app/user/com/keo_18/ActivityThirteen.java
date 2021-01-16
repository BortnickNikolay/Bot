package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityThirteen extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerThirteen1;
    Button btnShowAnswerThirteen2;
    Button btnShowAnswerThirteen3;
    Button btnShowAnswerThirteen4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score 1", 0);

        btnShowAnswerThirteen1 = (Button) findViewById(R.id.btnShowAnswerThirteen1);
        btnShowAnswerThirteen2 = (Button) findViewById(R.id.btnShowAnswerThirteen2);
        btnShowAnswerThirteen3 = (Button) findViewById(R.id.btnShowAnswerThirteen3);
        btnShowAnswerThirteen4 = (Button) findViewById(R.id.btnShowAnswerThirteen4);

        btnShowAnswerThirteen1.setOnClickListener(this);
        btnShowAnswerThirteen2.setOnClickListener(this);
        btnShowAnswerThirteen3.setOnClickListener(this);
        btnShowAnswerThirteen4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerThirteen1:
                btnShowAnswerThirteen1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFourteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerThirteen2:
                btnShowAnswerThirteen2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFourteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerThirteen3:
                btnShowAnswerThirteen3.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityFourteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerThirteen4:
                score = score + 1;
                btnShowAnswerThirteen4.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityFourteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}