package com.example.nurseryschool;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nurseryschool.Adapter.AdapterMessage;
import com.example.nurseryschool.Model.ModalMessage;

import java.util.ArrayList;

public class WinDowChat extends AppCompatActivity {
        RecyclerView recyclerView ;
        AdapterMessage adapterMessage ;
        ArrayList<ModalMessage> listModalMessage ;

    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.window_chat);
        getSupportActionBar().hide();
        this.createListMessage();
        adapterMessage = new AdapterMessage(this.listModalMessage) ;
        recyclerView = findViewById(R.id.window_chat_rv) ;
        recyclerView.setAdapter(adapterMessage);
        recyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false));
    }
    public void  createListMessage(){

        this.listModalMessage = new ArrayList<>();

        ModalMessage   m =new ModalMessage("Huynh Ngoc Tan Dap Trai", "1/6/2021" , "1") ;
        ModalMessage   m1 =new ModalMessage("Huynh Ngoc Tan Dap Trai" , "1/6/2021" , "2");
        ModalMessage   m2 =new ModalMessage("Huynh Ngoc Tan Dap Trai" , "1/6/2021" , "1");
        ModalMessage   m3 =new ModalMessage("Huynh Ngoc Tan Dap Trai" , "1/6/2021" , "2");
        ModalMessage   m4 =new ModalMessage("Huynh Ngoc Tan Dap Trai" , "1/6/2021" , "1");
        ModalMessage   m5 =new ModalMessage("Huynh Ngoc Tan Dap Trai" , "1/6/2021" , "1");

        this.listModalMessage.add(m) ;
        this.listModalMessage.add(m1) ;
        this.listModalMessage.add(m2)  ;
        this.listModalMessage.add(m3) ;
        this.listModalMessage.add(m4)  ;
        this.listModalMessage.add(m5) ;

    }
}
