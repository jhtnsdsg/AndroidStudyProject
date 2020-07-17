package jht.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button=findViewById(R.id.but4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
//                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
//                startActivity(intent);
            }
        });

        Button button_first=findViewById(R.id.but5);
        button_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.jht.activitytest.ACTION_START");
                startActivity(intent);
            }
        });

        Button button_thitd=findViewById(R.id.bt_to_third);
        button_thitd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("android.intent.action.VIEW");
                startActivity(intent);
            }
        });
    }
}