package com.example.nurseryschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nurseryschool.Adapter.AdapterNameUserChat;
import com.example.nurseryschool.Model.ModalMessage;
import com.example.nurseryschool.Model.ModalMessageUser;

import java.util.ArrayList;

public class DisPlayUserChat extends AppCompatActivity {
    RecyclerView recyclerView ;
    AdapterNameUserChat adapterNameUserChat ;
    ArrayList<ModalMessageUser> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_play_user_chat);
        getSupportActionBar().hide();
        createList();
        recyclerView = findViewById(R.id.rvUserChat);
        adapterNameUserChat = new AdapterNameUserChat(this.list) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false));
        recyclerView.setAdapter(adapterNameUserChat);

    }
    public void createList(){
        this.list = new ArrayList<>() ;
       ModalMessageUser m = new ModalMessageUser("Hello Tan DB" , "1/6/2021", "" +
               "https://firebasestorage.googleapis.com/v0/b/cnpm-29a1b.appspot.com/o/bttb.png?alt=media&token=82649565-8481-4a40-b045-2970e2efd8e2") ;
        ModalMessageUser m1= new ModalMessageUser("Hello Tan DB" , "1/6/2021", "" +
                "https://firebasestorage.googleapis.com/v0/b/cnpm-29a1b.appspot.com/o/bttb.png?alt=media&token=82649565-8481-4a40-b045-2970e2efd8e2") ;
        ModalMessageUser m2 = new ModalMessageUser("Hello Tan DB" , "1/6/2021", "" +
                "https://firebasestorage.googleapis.com/v0/b/cnpm-29a1b.appspot.com/o/bttb.png?alt=media&token=82649565-8481-4a40-b045-2970e2efd8e2") ;

this.list.add(m) ;
this.list.add(m1)  ;
this.list.add(m2 ) ;
    }

}