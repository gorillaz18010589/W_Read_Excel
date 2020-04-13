package com.example.w_read_excel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordRecyclerAdapter extends RecyclerView.Adapter<WordRecyclerAdapter.WordRecyclerViewHolder> {
    private Context context;
    private List<Word> mData;

    public WordRecyclerAdapter(Context context, List<Word> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public WordRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itwm_word,parent,false);
        WordRecyclerViewHolder wordRecyclerViewHolder = new WordRecyclerViewHolder(view);
        return wordRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WordRecyclerViewHolder holder, int position) {
            holder.txtId.setText(mData.get(position).id);
            holder.txtNon.setText(mData.get(position).noun);
            holder.txtNonTw.setText(mData.get(position).nountw);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class WordRecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView txtId,txtNon,txtNonTw;
        public WordRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            txtId = itemView.findViewById(R.id.txtId);
            txtNon = itemView.findViewById(R.id.txtNon);
            txtNonTw = itemView.findViewById(R.id.txtNonTw);
        }
    }
}
