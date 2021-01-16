package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwelve extends AppCompatActivity implements OnClickListener {

    Button btnShowAnswerTwelve1;
    Button btnShowAnswerTwelve2;
    Button btnShowAnswerTwelve3;
    Button btnShowAnswerTwelve4;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnShowAnswerTwelve1 = (Button) findViewById(R.id.btnShowAnswerTwelve1);
        btnShowAnswerTwelve2 = (Button) findViewById(R.id.btnShowAnswerTwelve2);
        btnShowAnswerTwelve3 = (Button) findViewById(R.id.btnShowAnswerTwelve3);
        btnShowAnswerTwelve4 = (Button) findViewById(R.id.btnShowAnswerTwelve4);

        btnShowAnswerTwelve1.setOnClickListener(this);
        btnShowAnswerTwelve2.setOnClickListener(this);
        btnShowAnswerTwelve3.setOnClickListener(this);
        btnShowAnswerTwelve4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShowAnswerTwelve1:
                btnShowAnswerTwelve1.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityThirteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerTwelve2:
                btnShowAnswerTwelve2.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityThirteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerTwelve3:
                score = score + 1;
                btnShowAnswerTwelve3.setBackgroundColor(getResources().getColor(R.color.Green));
                Intent intent = new Intent(this, ActivityThirteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
        switch (v.getId()) {
            case R.id.btnShowAnswerTwelve4:
                btnShowAnswerTwelve4.setBackgroundColor(getResources().getColor(R.color.Red));
                Intent intent = new Intent(this, ActivityThirteen.class);
                intent.putExtra("int score", score);
                startActivity(intent);
                finish();
        }
    }
}