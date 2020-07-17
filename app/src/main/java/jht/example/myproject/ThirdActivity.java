package jht.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final Intent intent=getIntent();
        TextView textView=findViewById(R.id.text1);
        String data=intent.getStringExtra("data");
        textView.setText(data);
        Log.d("ThitdActivity",data);


        /**
         * 将数据返回给上一级
         */
        Button button1=findViewById(R.id.but_third);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.ed2);
                Intent intent1=new Intent();
                intent.putExtra("data_return",editText.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}