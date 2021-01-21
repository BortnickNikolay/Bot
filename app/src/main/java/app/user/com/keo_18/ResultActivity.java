package app.user.com.keo_18;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import app.user.com.keo_18.domain.Exam;

public class ResultActivity extends AppCompatActivity implements OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Button btnExit = findViewById(R.id.btnExit);
        Button btnResult = findViewById(R.id.btnResult);

        btnExit.setOnClickListener(this);
        btnResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        Exam exam = ((MyApplication) this.getApplication()).getExam();

        switch (button.getId()) {
            case R.id.btnExit:
                exam.reset();
                finishAffinity();

            case R.id.btnResult:
                button.setText("Вы набрали = " + exam.getScore());
        }
    }
}
