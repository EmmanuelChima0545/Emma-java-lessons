package org.example.OOP;

public class Body {
    private String gizzard;
    private Anus anus;
    public int wing;
    public int thigh;
    private int liver;

    Body(String gizzard,Anus anus,int wing,int thigh,int liver){
        this.gizzard = gizzard;
        this.anus = anus;
        this.wing = wing;
        this.thigh = thigh;
        this.liver = liver;
    }

    public String getGizzard() {
        return gizzard;
    }

    public Anus getAnus() {
        return anus;
    }


    public int getLiver() {
        return liver;
    }
}
