package com.example.postappp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class otherNorecive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_other_norecive);

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = WindowManager.LayoutParams.WRAP_CONTENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        params.gravity = Gravity.CENTER;
        getWindow().setAttributes(params);

        Button no_nature_o = (Button) findViewById(R.id.no_nature_o);
        Button no_nature_x = (Button) findViewById(R.id.no_nature_x);


        no_nature_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(otherNorecive.this, otherNature.class);
                startActivity(intent);
                finish();

            }
        });

        no_nature_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(otherNorecive.this, MainActivity.class);
                intent.putExtra("reason", "본인 수령을 하실때 신분증이 필요합니다.");
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}