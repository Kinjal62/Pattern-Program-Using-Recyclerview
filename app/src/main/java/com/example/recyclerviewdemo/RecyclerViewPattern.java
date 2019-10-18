package com.example.recyclerviewdemo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerviewdemo.adapter.RecyclerViewAdapterPattern;
import com.example.recyclerviewdemo.model.RecyclerviewModelPattern;

import java.util.ArrayList;

public class RecyclerViewPattern extends AppCompatActivity {
    RecyclerView rvitempattern;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<RecyclerviewModelPattern> myListdata = new ArrayList<>();
    RecyclerViewAdapterPattern recyclerViewAdapterPattern;
    RecyclerviewModelPattern temp;
    ArrayList<String> nolist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_pattern);
        rvitempattern = findViewById(R.id.rvitempattern);
         for(int i=1;i<10;i++){
              nolist.clear();
              temp = new RecyclerviewModelPattern();
                for(int j=1;j<=i;j++) {
                    nolist.add(i+" ");
                }

                temp.setNo(nolist);
              temp.setItemPattern(nolist.toString().replaceAll("\\[", " ").replaceAll("\\]"," ").replaceAll(",", ""));
              myListdata.add(temp);
        }
        layoutManager = new LinearLayoutManager(RecyclerViewPattern.this,LinearLayoutManager.VERTICAL,false);
        rvitempattern.setLayoutManager(layoutManager);
        recyclerViewAdapterPattern = new RecyclerViewAdapterPattern(RecyclerViewPattern.this,myListdata);
        rvitempattern.setAdapter(recyclerViewAdapterPattern);
    }
}
