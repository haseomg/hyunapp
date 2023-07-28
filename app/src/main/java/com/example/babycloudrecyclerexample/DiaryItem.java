package com.example.babycloudrecyclerexample;

public class DiaryItem {
    String birth;
    String diary; //직급
    int image;//프사

    public DiaryItem(String birth, String diary, int image) {
        this.birth = birth;
        this.diary = diary;
        this.image = image;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String brith) {
        this.birth = brith;
    }

    public String getDiary() {
        return diary;
    }

    public void setDiary(String comment) {
        this.diary = diary;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

