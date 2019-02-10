package com.example.myrecyclerviewexam;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyRecyclerAdapter2 extends RecyclerView.Adapter<MyRecyclerAdapter2.MyViewHolder> {
    private List<CardItem> mDatas;

    public MyRecyclerAdapter2(List<CardItem> datas) {
        mDatas = datas;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        CardItem cardItem = mDatas.get(i);
        viewHolder.txtTitle.setText(cardItem.getTitle());
        viewHolder.txtContent.setText((cardItem.getContent()));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtContent;
        Button btnOK, btnNO;

        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtContent = itemView.findViewById(R.id.txtContent);
            btnOK = itemView.findViewById(R.id.btnYes);
            btnNO = itemView.findViewById(R.id.btnNo);

            btnOK.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), getAdapterPosition() + "", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
