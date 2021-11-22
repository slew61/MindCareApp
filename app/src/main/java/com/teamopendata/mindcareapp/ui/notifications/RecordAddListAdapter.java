package com.teamopendata.mindcareapp.ui.notifications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teamopendata.mindcareapp.R;

import java.util.ArrayList;

public class RecordAddListAdapter extends RecyclerView.Adapter<RecordAddListAdapter.RecordViewHolder>{


    private ArrayList<String> arrayList;

    public RecordAddListAdapter(ArrayList<String> list) { arrayList = list; }

    @Override
    public RecordAddListAdapter.RecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RecordAddListAdapter.RecordViewHolder recordViewHolder;
        View view  = inflater.inflate(R.layout.item_add_record,parent,false);
        recordViewHolder = new RecordAddListAdapter.RecordViewHolder(view);
        return recordViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecordViewHolder holder, final int position) {

    }

    public void addItem(String s)
    {
        arrayList.add(s);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecordViewHolder extends RecyclerView.ViewHolder {

        public RecordViewHolder(View itemView) {
            super(itemView);
        }

    }
}