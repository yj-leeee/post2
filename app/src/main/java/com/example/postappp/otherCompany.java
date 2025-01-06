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

public class otherCompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_other_company);

        Button otherCompany_o = findViewById(R.id.otherCompany_o);
        Button otherCompany_x = findViewById(R.id.otherCompany_x);

        otherCompany_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(otherCompany.this, otherNoCompany.class);
                startActivity(intent);

            }
        });

        otherCompany_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면 전환
                Intent intent = new Intent(otherCompany.this, receiveNo.class);
                intent.putExtra("reason", "대리인 신분증, 재직증명서, 사업증명서가 있어야 수령 가능합니다.");
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