package com.example.babycloudrecyclerexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DiaryAdapter extends RecyclerView.Adapter<DiaryAdapter.ViewHolder>{

    private ArrayList<DiaryItem> adapterDiaryList;

    @NonNull
    @Override
    /**
     * 리스트 아이템을 가져와서 레이아웃을 실체화 해줌
     * 실체화를 해주는 아이가 Inflater
     * **/
    public DiaryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    /**
     * 액티비티에서 받아온 데이터를 바인딩해줌.
     * **/
    @Override
    public void onBindViewHolder(@NonNull DiaryAdapter.ViewHolder holder, int position) {
        holder.onBind(adapterDiaryList.get(position));
    }


    /**
     * 리사이클러뷰 리스트 사이즈를 불러옴
     * **/
    @Override
    public int getItemCount() {
        return adapterDiaryList.size();
    }

    public void setDiaryList(ArrayList<DiaryItem> mainActivityDataList) { // list -> MainActivity에서 받아온 어레이리스트안에 있는 값.
        this.adapterDiaryList = mainActivityDataList; // studentList -> 어댑터에서 만들어진 어레이리스트.
        notifyDataSetChanged();
    }

    /**
     * 뷰홀더 생성
     * **/
    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView birth;
        TextView diary;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = (ImageView)itemView.findViewById(R.id.image);
            birth = (TextView)itemView.findViewById(R.id.birth);
            diary = (TextView)itemView.findViewById(R.id.diary);
        }

        void onBind(DiaryItem item) {
            image.setImageResource(item.getImage());
            birth.setText(item.getBirth());
            diary.setText(item.getDiary());
        }
    }
}
