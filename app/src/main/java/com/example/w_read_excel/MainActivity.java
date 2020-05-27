package com.example.w_read_excel;
//1.準備類別對應欄位
//2.讀取Raw串流街道bufferedReader
//3.用readLine一行一行讀取

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Word> wordList;
    private RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordList = new ArrayList<>();
        recView = findViewById(R.id.recView);
        readExcel();

        WordRecyclerAdapter wordRecyclerAdapter = new WordRecyclerAdapter(this, wordList);
        recView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recView.setAdapter(wordRecyclerAdapter);
    }


    public void readExcel() {
        //2.讀取Raw串流街道bufferedReader
        InputStream inputStream = getResources().openRawResource(R.raw.datav2);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream, Charset.forName("x-windows-950"))
        );


        //3.用readLine一行一行讀取
        String line = "";
        try {
            while ((line = bufferedReader.readLine()) != null) {
                //4.切割逗號
                String[] data = line.split(",");

//                for(String datas : data){
//                    Log.v("hank", ""+datas);
//                }

//               5.將切割後的資料存放在Model裡
                Word word = new Word();
                word.setId(data[0]);
                word.setType(data[1]);
                word.setNoun(data[2]);
                word.setNountw(data[3]);
                wordList.add(word);
                Log.v("hank", "id:" + word.getId() + "/type:" + word.getType() + "/Noun:" + word.getNoun() + "/Nounttw:" + word.getNountw() + data.length);
            }
        } catch (Exception e) {
            Log.v("hank", e.toString());
        }
    }
}

