package ws;

import java.util.Date;

public class Compte {
    private int code ;
    private double mt;

    private Date dateCreation ;

    public Compte(){

    }

    public Compte(int code ,double mt){
        this.code=code;
        this.mt=mt;
        this.dateCreation=new Date();

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMt() {
        return mt;
    }

    public void setMt(double mt) {
        this.mt = mt;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
