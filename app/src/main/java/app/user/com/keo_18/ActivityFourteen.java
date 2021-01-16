package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityFourteen extends AppCompatActivity implements OnClickListener {

    Button btnExit;
    Button btnResult;
    int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);

        Intent intent = getIntent();
        score = intent.getIntExtra("int score", 0);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnResult = (Button) findViewById(R.id.btnRusult);

        btnExit.setOnClickListener(this);
        btnResult.setOnClickListener(this);
    }

    @Override
     public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnExit:
                 finishAffinity();

        }
        switch (v.getId()) {
            case R.id.btnRusult:
                btnResult.findViewById(R.id.btnRusult);
                btnResult.setText(String.valueOf("Вы набрали = "+ score));
        }
    }
}
