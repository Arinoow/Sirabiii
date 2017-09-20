package com.example.arian.sirabi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {
  String dashed;
  Integer score = 0;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);

    ImageView img_1=(ImageView) findViewById(R.id.img_1);
    final TextView txt_word = (TextView) findViewById(R.id.txt_word);
    final TextView txt_score = (TextView) findViewById(R.id.txt_score);
    Bundle extras = getIntent().getExtras();
    dashed = extras.getString("Dashed");
    final String word = extras.getString("Word");
    Integer picture = extras.getInt("Picture");
    txt_word.setText(dashed);
    img_1.setImageResource(picture);

    final ArrayList<Button> btnArray = new ArrayList<>();

    btnArray.add((Button) findViewById(R.id.btn_ا));
    btnArray.add((Button) findViewById(R.id.btn_ب));
    btnArray.add((Button) findViewById(R.id.btn_پ));
    btnArray.add((Button) findViewById(R.id.btn_ت));
    btnArray.add((Button) findViewById(R.id.btn_ث));
    btnArray.add((Button) findViewById(R.id.btn_ج));
    btnArray.add((Button) findViewById(R.id.btn_چ));
    btnArray.add((Button) findViewById(R.id.btn_ح));
    btnArray.add((Button) findViewById(R.id.btn_خ));
    btnArray.add((Button) findViewById(R.id.btn_د));
    btnArray.add((Button) findViewById(R.id.btn_ذ));
    btnArray.add((Button) findViewById(R.id.btn_ر));
    btnArray.add((Button) findViewById(R.id.btn_ز));
    btnArray.add((Button) findViewById(R.id.btn_ژ));
    btnArray.add((Button) findViewById(R.id.btn_س));
    btnArray.add((Button) findViewById(R.id.btn_ش));
    btnArray.add((Button) findViewById(R.id.btn_ص));
    btnArray.add((Button) findViewById(R.id.btn_ض));
    btnArray.add((Button) findViewById(R.id.btn_ط));
    btnArray.add((Button) findViewById(R.id.btn_ظ));
    btnArray.add((Button) findViewById(R.id.btn_ع));
    btnArray.add((Button) findViewById(R.id.btn_غ));
    btnArray.add((Button) findViewById(R.id.btn_ف));
    btnArray.add((Button) findViewById(R.id.btn_ق));
    btnArray.add((Button) findViewById(R.id.btn_ک));
    btnArray.add((Button) findViewById(R.id.btn_گ));
    btnArray.add((Button) findViewById(R.id.btn_ل));
    btnArray.add((Button) findViewById(R.id.btn_م));
    btnArray.add((Button) findViewById(R.id.btn_ن));
    btnArray.add((Button) findViewById(R.id.btn_و));
    btnArray.add((Button) findViewById(R.id.btn_ه));
    btnArray.add((Button) findViewById(R.id.btn_ی));

    View.OnClickListener btnListener = new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Button button = (Button) v;
        String id = button.getResources().getResourceEntryName(button.getId());
        id = id.replace("btn_", "");


        for (int k = 0; k < word.length(); k++) {
          if (word.charAt(k) == id.charAt(0)) {
            char[] wordDashedCharArray = dashed.toCharArray();
            wordDashedCharArray[k] = id.charAt(0);
            dashed = new String(wordDashedCharArray);
            txt_word.setText(dashed);


            if (word.contains(id)){
              button.setVisibility(View.INVISIBLE);
            }

            if (!dashed.contains("-")){
              Intent intent = new Intent(GameActivity.this,EndActivity.class);

              Toast.makeText(GameActivity.this,"you won", Toast.LENGTH_LONG).show();
              startActivity(intent);
              score += 50;
              txt_score.setText(score.toString());

            }

          }
        };
      }
    };

    for (Button i : btnArray) {
      i.setOnClickListener(btnListener);
    }
  }
}
