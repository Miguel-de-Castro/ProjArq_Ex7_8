package com.bcopstein;

import com.google.gson.Gson;

// this code use Gson: https://github.com/google/gson/blob/master/UserGuide.md

public class HistoryDTO {
    private String from;
    private String to;
    private double rate;
    
    public HistoryDTO(String from, String to, double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public HistoryDTO(){

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "HistoryDTO [from=" + from + ", rate=" + rate + ", to=" + to + "]";
    }  
    
    public static HistoryDTO fromJSon(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, HistoryDTO.class);
    }

    public String toJSon(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
