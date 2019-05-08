package com.example.rssfeed.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rssfeed.Interface.itemClickListener;
import com.example.rssfeed.Model.RSSObject;
import com.example.rssfeed.R;

import java.util.zip.Inflater;

class FeedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener
{
    public TextView txtTitle,txtDate,txtContent;
    private com.example.rssfeed.Interface.itemClickListener itemClickListener;

    public FeedViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtDate = itemView.findViewById(R.id.txtDate);
        txtContent = itemView.findViewById(R.id.txtContent);

        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void setItemClickListener(com.example.rssfeed.Interface.itemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),true);
        return true;
    }
}
public class feedAdapter extends RecyclerView.Adapter<FeedViewHolder>
{
    private RSSObject rssObject;
    private Context context;
    private LayoutInflater inflater;

    public feedAdapter(RSSObject rssObject, Context context) {
        this.rssObject = rssObject;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public FeedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = inflater.inflate(R.layout.row,viewGroup,false);
        return new FeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedViewHolder feedViewHolder, int i) {
        feedViewHolder.txtTitle.setText(rssObject.getItems().get(i).getTitle());
        feedViewHolder.txtDate.setText(rssObject.getItems().get(i).getPubDate());
        feedViewHolder.txtContent.setText(rssObject.getItems().get(i).getContent());

        feedViewHolder.setItemClickListener(new itemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if(!isLongClick)
                {
                    Intent browser = new Intent(Intent.ACTION_VIEW,Uri.parse(rssObject.getItems().get(position).getLink()));
                    browser.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(browser);
                    //view.getContext().startActivity(browser);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return rssObject.items.size();
    }
}
