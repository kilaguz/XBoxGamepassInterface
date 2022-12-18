package com.example.xboxgamepass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.xboxgamepass.data.Kartlar;
import com.example.xboxgamepass.databinding.ActivityMainBinding;
import com.example.xboxgamepass.ui.adapter.KartlarAdapter;
import com.example.xboxgamepass.ui.adapter.OyunAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Kartlar> kartList = new ArrayList<>();

        Kartlar k1 = new Kartlar(1,"bagimsiz_oyunlar");
        Kartlar k2 = new Kartlar(2,"ailedostu");
        Kartlar k3 = new Kartlar(3,"klasikler");
        Kartlar k4 = new Kartlar(4,"nisanci");
        Kartlar k5 = new Kartlar(5,"spor");
        Kartlar k6 = new Kartlar(6,"aksiyonmacera");
        Kartlar k7 = new Kartlar(7,"platform");
        Kartlar k8 = new Kartlar(8,"dovus");
        kartList.add(k1);
        kartList.add(k2);
        kartList.add(k3);
        kartList.add(k4);
        kartList.add(k5);
        kartList.add(k6);
        kartList.add(k7);
        kartList.add(k8);

        binding.rvOyun.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Kartlar> oyunList = new ArrayList<>();

        Kartlar o1 = new Kartlar(9,"daystodie");
        Kartlar o2 = new Kartlar(10,"amemoirblue");
        Kartlar o3 = new Kartlar(11,"plaguetale");
        oyunList.add(o1);
        oyunList.add(o2);
        oyunList.add(o3);




        KartlarAdapter adapter = new KartlarAdapter(this,kartList);
        binding.rv.setAdapter(adapter);
        OyunAdapter adapterOyun = new OyunAdapter(this,oyunList);
        binding.rvOyun.setAdapter(adapterOyun);


    }
}