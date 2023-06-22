package digi.tech.gmaillogin_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_screen extends AppCompatActivity {
    ImageView img;
    TextView texv;
    Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        img=findViewById(R.id.iv1);
        texv=findViewById(R.id.email);
        bt=findViewById(R.id.btn1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}