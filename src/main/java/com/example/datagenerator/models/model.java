package com.example.datagenerator.models;



public class model {

    private String type;
    private double coordinates;
    private String risk_type;
    private int risk_value;

    public model(String type, double coordinates, String risk_type, int risk_value){
        this.type = type;
        this.coordinates = coordinates;
        this.risk_type = risk_type;
        this.risk_value = risk_value;
    }
}
