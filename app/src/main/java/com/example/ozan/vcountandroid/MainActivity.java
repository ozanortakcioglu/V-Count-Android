package com.example.ozan.vcountandroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button next;
    TextView terms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.next);
        terms=findViewById(R.id.terms);
        final Intent intent = new Intent(this,Main2Activity.class);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        SpannableString content = new SpannableString("terms & conditions");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        terms.setText(content);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                terms.setTextColor(Color.BLUE);
            }
        });
    }
}
