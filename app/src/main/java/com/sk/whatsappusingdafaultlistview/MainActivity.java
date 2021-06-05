package com.sk.whatsappusingdafaultlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    int[] profiles = {R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar};
    String[] name = {"sheetal","Sarthak","Soham","Shivani","Abhishek","Shraddha","Neha","sheetal","Sarthak","Soham"};
    String[] email = {"sheetal@gmail.com","sarthak@gmail.com","soham@gmail.com","shivani@gmail.com","abhi@gmail.com","shraddha@gmail.com","neha@gmail.com","sheetal@gmail.com","sarthak@gmail.com","soham@gmail.com"};
    int[] del = {R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_delete_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        ViewAdapter viewAdapter;

        viewAdapter = new ViewAdapter(this,profiles,name,email,del);

        listView.setAdapter(viewAdapter);

    }
}