package app.user.com.keo_18;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import app.user.com.keo_18.ActivityTwo;
import app.user.com.keo_18.R;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnActOnetoTwo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActOnetoTwo = (Button) findViewById(R.id.btnActOnetoTwo);
        btnActOnetoTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOnetoTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
        }
    }
}