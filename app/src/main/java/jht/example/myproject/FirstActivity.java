package jht.example.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button b_baidu=findViewById(R.id.bu_baidu);
        b_baidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://baidu.com"));
                startActivity(intent);
            }
        });

        Button button1=findViewById(R.id.but1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e=findViewById(R.id.ed1);
                Intent intent=new Intent(FirstActivity.this,ThirdActivity.class);
                intent.putExtra("data",e.getText().toString());
                startActivityForResult(intent,1);
            }
        });



    }


    /**
     * 接收上一个Activity返回的数据
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    TextView t1 = findViewById(R.id.text2);
                    String ret = "得到ActivityThird的返回值为：";
                    t1.setText(ret+data.getStringExtra("data_return"));
                }
            default:
        }
    }
}