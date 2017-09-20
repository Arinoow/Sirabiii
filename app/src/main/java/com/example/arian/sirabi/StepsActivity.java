package com.example.arian.sirabi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class StepsActivity extends AppCompatActivity {




  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_step);

    TextView txt_score =(TextView)findViewById(R.id.txt_score);



    ImageButton imb1 = (ImageButton) findViewById(R.id.imb1);
    imb1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {


        Intent intent= new Intent(StepsActivity.this, GameActivity.class);
        String word = "رنگین کمان";
        intent.putExtra("Word",  word);
        Integer picture=(R.drawable.rangin_kaman);
        intent.putExtra("Picture",  picture);
        String wordDashed="";
        for (int i=0; i<word.length();i++){
          if (word.charAt(i)!= ' '){
            wordDashed+="-";
          }else{
            wordDashed+=" ";
          }
        }
        intent.putExtra("Dashed",  wordDashed);
        startActivity(intent);

      }
    });
   ImageButton imb2 = (ImageButton) findViewById(R.id.imb2);
   imb2.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {

    Intent intent= new Intent(StepsActivity.this, GameActivity.class);
    String word = "دومینو" ;
    intent.putExtra("Word",  word);
    Integer picture=(R.drawable.domino);
    intent.putExtra("Picture",  picture);
    String wordDashed="";
    for (int i=0; i<word.length();i++){
      if (word.charAt(i)!= ' '){
        wordDashed+="-";
      }else{
        wordDashed+=" ";
      }
    }
    intent.putExtra("Dashed",  wordDashed);
    startActivity(intent);

     }
   });

   ImageButton imb3 = (ImageButton) findViewById(R.id.imb3);
   imb3.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {

    Intent intent= new Intent(StepsActivity.this, GameActivity.class);
    String word = "پدال";
    intent.putExtra("Word",  word);
    Integer picture=(R.drawable.pedal);
    intent.putExtra("Picture",  picture);
    String wordDashed="";
    for (int i=0; i<word.length();i++){
      if (word.charAt(i)!= ' '){
        wordDashed+="-";
      }else{
        wordDashed+=" ";
      }
    }
    intent.putExtra("Dashed",  wordDashed);

    startActivity(intent);

      }
    });
    ImageButton imb4 = (ImageButton) findViewById(R.id.imb4);
    imb4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

   Intent intent= new Intent(StepsActivity.this, GameActivity.class);
   String word ="ستاره";
   intent.putExtra("Word",  word);
   Integer picture=(R.drawable.star);
   intent.putExtra("Picture",  picture);
   String wordDashed="";
   for (int i=0; i<word.length();i++){
     if (word.charAt(i)!= ' '){
       wordDashed+="-";
     }else{
       wordDashed+=" ";
     }
   }
   intent.putExtra("Dashed",  wordDashed);
   startActivity(intent);

      }
    });
  }
}
