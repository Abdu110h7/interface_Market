package com.example.interface_market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<PostModel> postModelList;
    List<StoryModel> storyModelList;
    RecyclerView postRecyclerView, storyRecyclerView;
    PostAdapter postAdapter;
    StoryAdapter storyAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
        initViews();
        postAdapter = new PostAdapter(postModelList);
         storyAdapter = new StoryAdapter(storyModelList);

         postRecyclerView.setAdapter(postAdapter);
         storyRecyclerView.setAdapter(storyAdapter);
    }

    private void initViews() {
        postRecyclerView = findViewById(R.id.postReci);
        storyRecyclerView = findViewById(R.id.recyclerView);
    }

    private void setList() {
        postModelList =  new ArrayList<>();
        postModelList.add(new PostModel(R.drawable.fase_1,"Abdulloh","3 days ago",100,56,R.drawable.img_2,false));
        postModelList.add(new PostModel(R.drawable.fase_3,"Ali Muhammad","2 days ago",89,56,R.drawable.img_3,false));
        postModelList.add(new PostModel(R.drawable.faes_2,"Asadbek","1 days ago",100,12,R.drawable.img_1,false));
        postModelList.add(new PostModel(R.drawable.fase_3,"Muhammad Aziz","5 days ago",99,85, R.drawable.cars_2,false));
        postModelList.add(new PostModel(R.drawable.fase_4,"Muhammad Iso","7days ago",55,32,R.drawable.faes_2,false));
        postModelList.add(new PostModel(R.drawable.fase_5,"Zafarbek","4 days ago",78,96,R.drawable.fase_4,false));
        postModelList.add(new PostModel(R.drawable.faes_2,"Zabuxullo","10 days ago",99,16,R.drawable.fase_5,false));

        storyModelList = new ArrayList<>();
        storyModelList.add(new StoryModel(R.drawable.cars_3,true));
        storyModelList.add(new StoryModel(R.drawable.cars_1,true));
        storyModelList.add(new StoryModel(R.drawable.cars_2,false));
        storyModelList.add(new StoryModel(R.drawable.cars_4,true));
        storyModelList.add(new StoryModel(R.drawable.img_2,true));
        storyModelList.add(new StoryModel(R.drawable.cars_1,true));
    }
}