package edu.dmacc.code.dsm.Homework14;

import java.util.ArrayList;
import java.util.List;

public class DogGroomingShop {

    private Object packages;
    private Object employees;
    private Object supplies;


    DogGroomingShop(List<String> packages) {
        this.packages = packages;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public void setSupplies(List<String> supplies) {
        this.supplies = supplies;
    }

    public DogGroomingShop() {
        this.packages = new ArrayList();
        this.employees = new ArrayList();
        this.supplies = new ArrayList();


        public void setPackages (Object packages){
            this.packages = packages;
        }

        public Object getPackages () {
            return packages;
        }

        public Object getEmployees () {
            return employees;
        }

        public void setEmployees (Object employees){
            this.employees = employees;
        }

        public Object getSupplies () {
            return supplies;
        }

        public void setSupplies (Object supplies){
            this.supplies = supplies;
        }

        @Override
        public String toString () {
            return "DogGroomingShop{" +
                    "packages=" + packages +
                    ", employees=" + employees +
                    ", supplies=" + supplies +
                    '}';
        }

    }