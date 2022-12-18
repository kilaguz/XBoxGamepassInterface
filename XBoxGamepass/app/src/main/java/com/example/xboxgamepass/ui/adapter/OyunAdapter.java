package com.example.xboxgamepass.ui.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xboxgamepass.data.Kartlar;
import com.example.xboxgamepass.databinding.OyunTasarimBinding;

import java.util.List;

public class OyunAdapter extends RecyclerView.Adapter<OyunAdapter.OyunTasarımHolder>{
    private Context mContext;
    private List<Kartlar> oyunKartlar;

    public OyunAdapter(Context mContext, List<Kartlar> oyunKartlar) {
        this.mContext = mContext;
        this.oyunKartlar = oyunKartlar;
    }

    public class OyunTasarımHolder extends RecyclerView.ViewHolder {
        private OyunTasarimBinding binding;

        public OyunTasarımHolder(OyunTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public OyunTasarımHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        OyunTasarimBinding binding = OyunTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new OyunTasarımHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OyunTasarımHolder holder, int position) {
        Kartlar kart = oyunKartlar.get(position);
        OyunTasarimBinding o = holder.binding;
        o.imageView.setImageResource(mContext.getResources().getIdentifier(kart.getResminAdi(), "drawable", mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return oyunKartlar.size();
    }

}