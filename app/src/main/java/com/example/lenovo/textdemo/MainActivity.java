package com.example.lenovo.textdemo;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ShowText {

    private Button button;
    private Utils utils;
    private boolean click= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        utils = new Utils(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = Text("按钮被点击了");
                button.setText(str);


            }
        });

        SystemClock.sleep(2000);
        if(click= false){
            utils.failed("点击错误！");
        }

    }

    public String Text(String string){
        utils.whirteText(string);
        return string;
    }
    @Override
    public String whriteText(String text) {
        return text;
    }

    @Override
    public void failed(String error) {

        Toast.makeText(MainActivity.this,"---错误"+error,Toast.LENGTH_LONG).show();
//        Log.d("失败", "failed: "+error);
    }
}
