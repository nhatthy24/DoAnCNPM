package com.example.nurseryschool.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nurseryschool.Model.ModalMessage;
import com.example.nurseryschool.Model.ModalMessageUser;
import com.example.nurseryschool.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterNameUserChat extends RecyclerView.Adapter<AdapterNameUserChat.NameChatViewHoder> {
    ArrayList<ModalMessageUser> list ;

    public AdapterNameUserChat(ArrayList<ModalMessageUser> list ){
        this.list = list ;

    }


    @NonNull
    @Override
    public NameChatViewHoder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_view , parent , false) ;
        return new NameChatViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AdapterNameUserChat.NameChatViewHoder holder, int position) {
        Picasso.get().load(list.get(position).getImage()).into(holder.imageView);


    }

    @Override

    public int getItemCount() {
        return list.size();
    }

    public static  class NameChatViewHoder extends RecyclerView.ViewHolder{
            ImageView imageView ;
            TextView textNameUser , textMessage , textTime ;
        public NameChatViewHoder(@NonNull  View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_card) ;
            textNameUser = itemView.findViewById(R.id.name_user) ;
            textTime = itemView.findViewById(R.id.textTime) ;
        }
    }

}
