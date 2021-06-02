package com.example.nurseryschool.Model;

public class ModalMessageUser {

    private String messageLast ;
    private String timeMessageLast ;
    private String image ;

    public ModalMessageUser(String messageLast, String timeMessageLast, String image) {
        this.messageLast = messageLast;
        this.timeMessageLast = timeMessageLast;
        this.image = image;
    }

    public String getMessageLast() {
        return messageLast;
    }

    public void setMessageLast(String messageLast) {
        this.messageLast = messageLast;
    }

    public String getTimeMessageLast() {
        return timeMessageLast;
    }

    public void setTimeMessageLast(String timeMessageLast) {
        this.timeMessageLast = timeMessageLast;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
