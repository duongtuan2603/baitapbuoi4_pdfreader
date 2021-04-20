package com.example.baitapbuoi4_pdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.ViewHolder> {
    List<File> mFiles;
    Context mContext;

    public FileAdapter(List<File> mFiles, Context mContext) {
        this.mFiles = mFiles;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View fileview = inflater.inflate(R.layout.layout_eachrow,parent,false);
        return new ViewHolder(fileview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        File file =  mFiles.get(position);
        holder.eachfilename.setText(file.getFilename());
    }

    @Override
    public int getItemCount() {
        return mFiles.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView eachfilename;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eachfilename = itemView.findViewById(R.id.txteachfilename);
        }
    }

}
