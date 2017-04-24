package com.example.chenjunhui.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        EditText edt=(EditText) findViewById(R.id.edt_4url);
        Button btn = (Button) findViewById(R.id.btn_4url);
        Intent intent=new Intent();
        intent.setData(Uri.parse("https://"+edt.getText().toString()));
        startActivity(intent);
    }

}
