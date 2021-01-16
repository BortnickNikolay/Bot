package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity implements OnClickListener {

    Button btnActTwotoThree;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActTwotoThree = (Button) findViewById(R.id.btnActTwotoThree);
        btnActTwotoThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwotoThree:
                Intent intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;
        }
    }
}