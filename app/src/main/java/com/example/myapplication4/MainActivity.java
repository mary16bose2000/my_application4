package com.example.myapplication4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String text = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
//        TextView textView1 = (TextView) findViewById(R.id.textView1);
//        final Intent intent = getIntent();
//        final String data = intent.getStringExtra(text);
//        textView1.setText(data);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }



    public void openActivity2(){

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String text1 = editText1.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(MainActivity2.text, text1);
        startActivityForResult(intent,2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        final String str = data.getStringExtra(MainActivity.text);
        TextViegitw textview = (TextView) findViewById(R.id.textView1);

        textview.setText(str);
    }
}