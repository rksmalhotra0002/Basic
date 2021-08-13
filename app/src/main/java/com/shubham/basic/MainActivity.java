package com.shubham.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private RecyclerView recyclerview;
private List<Integer>arraylist;
private List<String>arraylisttwo;
private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }
    private void initialize()
    {
        recyclerview=findViewById(R.id.recyclerview);

        arraylist=new ArrayList<>();
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);
        arraylist.add(R.drawable.adsicon);

        arraylisttwo=new ArrayList<>();
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");
        arraylisttwo.add("shubham");

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(linearLayoutManager);
        myAdapter=new MyAdapter(MainActivity.this,arraylist,arraylisttwo);
        recyclerview.setAdapter(myAdapter);

    }
}