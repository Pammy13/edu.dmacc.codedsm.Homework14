package edu.dmacc.code.dsm.Homework14;

import java.util.Collections;
import java.util.List;

public class FullPackage {
   String shampoo;
    String blowdry;
    String earcleaning;
    String glandexpression;
  String scentedspritz;
    String nailtrim;

    public FullPackage(String type, String hot, String ear, String glands, String scent, String paws){
        shampoo = type;
        blowdry = hot;
        earcleaning = ear;
        glandexpression = glands;
        scentedspritz = scent;
        nailtrim = paws;

    }


    @Override
       public String toString( ) {
        return "FullPackage{" +
                "shampoo='" + shampoo + '\'' +
                ", blowdry='" + blowdry + '\'' +
                ", earcleaning='" + earcleaning + '\'' +
                ", glandexpression='" + glandexpression + '\'' +
                ", scentedspritz='" + scentedspritz + '\'' +
                ", nailtrim='" + nailtrim + '\'' +
                '}';
    }

    public List<String> getBlowdry() {
        return blowdry;

        public void setBlowdry (String blowdry){
            this.blowdry = blowdry;
        }

        public List<String> getEarcleaning () {
            return earcleaning;
        }

        public void setEarcleaning (String earcleaning){
            this.earcleaning = Collections.singletonList(earcleaning);
        }

        private List<String> getGlandexpression () {
            return glandexpression;
        }

        public void setGlandexpression (String glandexpression){
            this.glandexpression = glandexpression;
        }

        public List<String> getScentedspritz () {
            return scentedspritz;
        }

        public void setScentedspritz (String scentedspritz){
            this.scentedspritz = scentedspritz;
        }

        public List<String> getNailtrim () {
            return nailtrim;
        }

        public void setNailtrim (String nailtrim){
            this.nailtrim = nailtrim;
        }


        public List<String> getShampoo () {
            public void setShampoo (String shampoo){
                this.shampoo = shampoo;
            }

            public List<String> getShampoo () {
                return shampoo;
            }

        }

