package com.example.postappp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Calendar;

public class number extends AppCompatActivity {

    private int currentNumber;
    private SharedPreferences preferences;
    private TextView numberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_number);

        preferences = getSharedPreferences("NumberPrefs", MODE_PRIVATE);
        numberTextView = findViewById(R.id.textView3);

        // 현재 날짜 확인
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_YEAR);
        int savedDay = preferences.getInt("lastSavedDay", -1);

        // 날짜가 바뀌었으면 번호 초기화
        if (currentDay != savedDay) {
            currentNumber = 0;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("currentNumber", currentNumber);
            editor.putInt("lastSavedDay", currentDay);
            editor.apply();
        } else {
            currentNumber = preferences.getInt("currentNumber", 0);
        }

        // 번호 증가 및 표시
        currentNumber++;
        updateNumberDisplay();

        // 번호 저장
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("currentNumber", currentNumber);
        editor.apply();

        Button maingo = findViewById(R.id.maingo);

        maingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(number.this, MainActivity.class);
                startActivity(intent);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void updateNumberDisplay() {
        numberTextView.setText(String.format("고객님의 순서는 %d번 입니다. \n 잠시만 기다려주십시오.", currentNumber));
    }

// ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
