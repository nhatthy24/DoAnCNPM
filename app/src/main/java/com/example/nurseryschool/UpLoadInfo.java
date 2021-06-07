package com.example.nurseryschool;

public class UpLoadInfo {
    public String imageName;
    public String imageURL;
    public UpLoadInfo(){}

    public UpLoadInfo(String name, String url) {
        this.imageName = name;
        this.imageURL = url;
    }

    public String getImageName() {
        return imageName;
    }
    public String getImageURL() {
        return imageURL;
    }
}
