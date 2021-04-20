package com.example.baitapbuoi4_pdfreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<File> files = new ArrayList<File>();
    FileAdapter adapter;
    Button btnaddfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        btnaddfile = findViewById(R.id.btnaddfile);
        files.add(new File("To Kill A Mocking Bird"));
        files.add(new File("To Kill A Mocking Bird"));
        files.add(new File("To Kill A Mocking Bird"));
        files.add(new File("To Kill A Mocking Bird"));
        files.add(new File("To Kill A Mocking Bird"));
        files.add(new File("To Kill A Mocking Bird"));
        adapter = new FileAdapter(files,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        btnaddfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                files.add(new File("Untitled"));
                adapter.notifyDataSetChanged();
            }
        });
    }
}