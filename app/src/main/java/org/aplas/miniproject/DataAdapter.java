package org.aplas.miniproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.GridViewHolder> {
    ArrayList<String> personNames;
    ArrayList<Integer> personImages;
    ArrayList<Integer> Detail;
    Context context;
    DataItem[] itemList;
    private OnItemClickListener mListener;

    public DataAdapter(Context context, ArrayList<String> personNames, ArrayList<Integer> personImages, ArrayList<Integer> Detail) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
        this.Detail = Detail;
    }
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_data, parent, false);
        // set the view's size, margins, paddings and layout parameters
        //GridViewHolder vh = new GridViewHolder(v); // pass the view to View Holder
//        return vh;
        return new GridViewHolder(v,mListener);
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, @SuppressLint("RecyclerView") int position) {
        //final DataItem dataItem = itemList[position];
        holder.name.setText(personNames.get(position));
        holder.image.setImageResource(personImages.get(position));
        // implement setOnClickListener event on item view.
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SubFruitActivity.class);
                intent.putExtra("image", personImages.get(position));
                intent.putExtra("detail", Detail.get(position)); // put image data in Intent
                context.startActivity(intent); // start Intent
            }
        });
    }

    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        mListener = (OnItemClickListener) listener;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        public View rowView;
        LinearLayout layout;

        public GridViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);

            // get the reference of item view's
            image = (ImageView) itemView.findViewById(R.id.img_item_photo);
            name = (TextView) itemView.findViewById(R.id.textView);
            layout = (LinearLayout) itemView.findViewById(R.id.layoutData);
            rowView = itemView;

        }

    }
}