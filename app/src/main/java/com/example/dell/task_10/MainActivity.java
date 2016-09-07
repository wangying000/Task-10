package com.example.dell.task_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        Button button1=(Button)findViewById(R.id.button2);
        Button button2=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name","小浣熊");
                intent.putExtra("price",1);
                startActivity(intent);
                finish();
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent1=new Intent(MainActivity.this,Main3Activity.class);
                intent1.putExtra("name","呀土豆");
                intent1.putExtra("price",3);
                startActivity(intent1);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent2=new Intent(MainActivity.this,Main4Activity.class);
                intent2.putExtra("name","卫龙");
                intent2.putExtra("price",2);
                startActivity(intent2);
                finish();
            }
        });
    }
}
