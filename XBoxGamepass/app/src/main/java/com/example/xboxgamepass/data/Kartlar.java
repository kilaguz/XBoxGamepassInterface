package com.example.xboxgamepass.data;

public class Kartlar {
    private int id;
    private String resminAdi;


    public Kartlar() {
    }

    public Kartlar(int id, String resminAdi) {
        this.id = id;
        this.resminAdi = resminAdi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResminAdi() {
        return resminAdi;
    }

    public void setResminAdi(String resminAdi) {
        this.resminAdi = resminAdi;
    }
}
