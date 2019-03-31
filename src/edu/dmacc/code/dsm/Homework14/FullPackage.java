package edu.dmacc.code.dsm.Homework14;

public class FullPackage {
    private String shampoo;
    private String towel;
    private String water;

    @Override
    public String toString() {
        return "FullPackage{" +
                "shampoo='" + shampoo + '\'' +
                ", towel='" + towel + '\'' +
                ", water='" + water + '\'' +
                '}';
    }

    public void setShampoo(String shampoo) {
        this.shampoo = shampoo;
    }

    public void setTowel(String towel) {
        this.towel = towel;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getWater() {
        return water;
    }

    public String getTowel() {
        return towel;
    }

    public String getShampoo() {
        return shampoo;
    }

        }

