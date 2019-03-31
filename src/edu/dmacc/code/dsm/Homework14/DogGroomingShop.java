package edu.dmacc.code.dsm.Homework14;

import java.util.ArrayList;
import java.util.List;

public class DogGroomingShop {
    private Object packages;
    private Object employees;
    private Object supplies;


    @Override
    public String toString() {
        return "DogGroomingShop{" +
                "packages=" + packages +
                ", employees=" + employees +
                ", supplies=" + supplies +
                '}';
    }

    public Object getPackages() {
        return packages;
    }

    public void setPackages(Object packages) {
        this.packages = packages;
    }

    public Object getEmployees() {
        return employees;
    }

    public void setEmployees(Object employees) {
        this.employees = employees;
    }

    public Object getSupplies() {
        return supplies;
    }

    public void setSupplies(Object supplies) {
        this.supplies = supplies;
    }
}


