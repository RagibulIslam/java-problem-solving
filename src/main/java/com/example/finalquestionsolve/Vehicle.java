package com.example.finalquestionsolve;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String model,vehicleType,manufacturer;
    private int makeofyear, importPrice,seatcapacity,regNo,cc;
    private boolean isElectric;

    public Vehicle(String model, String vehicleType, String manufacturer, int makeofyear, int importPrice, int seatcapacity, int regNo, int cc, boolean isElectric) {
        this.model = model;
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.makeofyear = makeofyear;
        this.importPrice = importPrice;
        this.seatcapacity = seatcapacity;
        this.regNo = regNo;
        this.cc = cc;
        this.isElectric = isElectric;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMakeofyear() {
        return makeofyear;
    }

    public void setMakeofyear(int makeofyear) {
        this.makeofyear = makeofyear;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public int getSeatcapacity() {
        return seatcapacity;
    }

    public void setSeatcapacity(int seatcapacity) {
        this.seatcapacity = seatcapacity;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", makeofyear=" + makeofyear +
                ", importPrice=" + importPrice +
                ", seatcapacity=" + seatcapacity +
                ", regNo=" + regNo +
                ", cc=" + cc +
                ", isElectric=" + isElectric +
                '}';
    }
}
