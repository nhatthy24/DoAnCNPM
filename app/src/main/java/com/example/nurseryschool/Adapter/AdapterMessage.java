package com.example.nurseryschool.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nurseryschool.Model.ModalMessage;
import com.example.nurseryschool.R;

import java.util.ArrayList;

public class AdapterMessage extends RecyclerView.Adapter  {
    ArrayList<ModalMessage>  listMessage ;
    int SEND_VIEW_TYPE  =1 ;
    int  RECEIVER_VIEW_TYPE =2 ;
    String  userId =  "1" ;

    public AdapterMessage(ArrayList<ModalMessage>  listMessage){
     this.listMessage = listMessage ;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        if(viewType ==SEND_VIEW_TYPE){
            View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_s , parent , false) ;
            return new  MessageViewHolderS(view) ;
        }else  {
             View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.message_r , parent , false) ;
             return new  MessageViewHolderR(view) ;

        }
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
        if(holder.getClass()==MessageViewHolderS.class){
            ((MessageViewHolderS) holder).messageS.setText(listMessage.get(position).getMessage());
            ((MessageViewHolderS) holder).timeS.setText(listMessage.get(position).getTime());
        }
        else {
            ((MessageViewHolderR) holder).messageR.setText(listMessage.get(position).getMessage());
            ((MessageViewHolderR) holder).timeR.setText(listMessage.get(position).getTime());
        }

    }

    @Override
    public int getItemCount() {
        return listMessage.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(listMessage.get(position).getId().equals(userId)) return SEND_VIEW_TYPE ;
        return RECEIVER_VIEW_TYPE ;
    }

    public static class MessageViewHolderS extends RecyclerView.ViewHolder {
        TextView messageS , timeS  ;
         public MessageViewHolderS(@NonNull  View itemView) {
             super(itemView);
             messageS = itemView.findViewById(R.id.message_s) ;
             timeS =  itemView.findViewById(R.id.time_s) ;
         }
     }
     public static  class MessageViewHolderR extends RecyclerView.ViewHolder {
        TextView messageR  , timeR ;
         public MessageViewHolderR(@NonNull View itemView) {
             super(itemView);
             messageR = itemView.findViewById(R.id.message_r) ;
             timeR = itemView.findViewById(R.id.time_r) ;
         }
     }

}
