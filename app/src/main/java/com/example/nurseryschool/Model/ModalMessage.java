package com.example.nurseryschool.Model;

public class ModalMessage {

     private  String message ;
     private String time ;
     private String id ;

    public ModalMessage(String message, String time, String id) {
        this.message = message;
        this.time = time;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
