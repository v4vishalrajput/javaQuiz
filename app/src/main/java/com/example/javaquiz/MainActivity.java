package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes,no;
    TextView textView;
    private String [] questions={"Java was programmed by Oracle?","java is object oriented programming language?","java does not supports interface?","JVM is java's compiler","java is platform independent language?"};
    private boolean [] answers={false,true,false,true,true};
    private int index=0;
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.Yes);
        no=findViewById(R.id.No);
        textView=findViewById(R.id.TextView);

        textView.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if( index<questions.length){
                  if(answers[index]){
                     score++;
                  }
                  index++;
                  if(index<questions.length){
                  textView.setText(questions[index]);
              }
                  else{
                      Toast.makeText(MainActivity.this, "Your score is "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                  }
              }
              else{
                  Toast.makeText(MainActivity.this, "Quiz has ended!", Toast.LENGTH_SHORT).show();
              }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( index<questions.length){
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if(index<questions.length){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }}
                else{
                    Toast.makeText(MainActivity.this, "Quiz has ended!", Toast.LENGTH_SHORT).show();
                }
            }
        });

}}