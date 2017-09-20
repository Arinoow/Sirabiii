package com.example.arian.sirabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_end);
    Button btn_1 = (Button) findViewById(R.id.btn_1);
    btn_1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent=new Intent(EndActivity.this,StepsActivity.class);
        startActivity(intent);
      }
    });
    Button btn_2 = (Button) findViewById(R.id.btn_1);

  }
}

