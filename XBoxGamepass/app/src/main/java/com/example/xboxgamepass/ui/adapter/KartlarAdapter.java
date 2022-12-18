package com.example.xboxgamepass.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xboxgamepass.data.Kartlar;
import com.example.xboxgamepass.databinding.KategoriTasarimBinding;

import java.util.List;

public class KartlarAdapter extends RecyclerView.Adapter<KartlarAdapter.CardTasarimHolder>{
    private Context mContext;
    private List<Kartlar> kartlarListesi;

    public KartlarAdapter(Context mContext, List<Kartlar> kartlarListesi) {
        this.mContext = mContext;
        this.kartlarListesi = kartlarListesi;
    }

    public class CardTasarimHolder extends RecyclerView.ViewHolder{
        private KategoriTasarimBinding binding;

        public CardTasarimHolder(KategoriTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public CardTasarimHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        KategoriTasarimBinding binding = KategoriTasarimBinding.inflate(LayoutInflater.from(mContext),parent, false);
        return new CardTasarimHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimHolder holder, int position) {
        Kartlar kart = kartlarListesi.get(position);
        KategoriTasarimBinding k = holder.binding;
        k.imageViewKart.setImageResource(mContext.getResources().getIdentifier(kart.getResminAdi(),"drawable",mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return kartlarListesi.size();
    }
}
