package com.example.postappp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class oneNature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  EdgeToEdge.enable(this);
        setContentView(R.layout.activity_one_nature);

        Button oneNature_o = findViewById(R.id.oneNature_o);
        Button oneNature_x = findViewById(R.id.oneNature_x);

        //신분증 지참0 번호표발부
        oneNature_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(oneNature.this, number.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "잠시만 기다려주십시오.", Toast.LENGTH_SHORT).show();
            }
        });

        //신분증 지참x 등기수령 x
        oneNature_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(oneNature.this, receiveNo.class);
                intent.putExtra("reason", "신분증을 지참하셔야 수령 가능합니다");
                startActivity(intent);
                overridePendingTransition(0, 0); // 애니메이션 제거

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}