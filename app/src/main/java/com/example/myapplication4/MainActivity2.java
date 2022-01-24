package com.example.myapplication4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    public static final String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button btn2 = (Button) findViewById(R.id.btn2);
        final Intent intent = getIntent();
        final String data = intent.getStringExtra(text);
        textView2.setText(data);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }


        });
    }

    public void openMainActivity(){
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String text2 = editText2.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.text, text2);

       setResult(Activity.RESULT_OK,intent);
      finish();
    }

}