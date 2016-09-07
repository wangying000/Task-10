package com.example.dell.task_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent2=getIntent();
        String name=intent2.getStringExtra("name");
        Integer price=intent2.getIntExtra("price",2);
        Toast.makeText(this,name+price+"元", Toast.LENGTH_LONG).show();

        Button button=(Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Main4Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
