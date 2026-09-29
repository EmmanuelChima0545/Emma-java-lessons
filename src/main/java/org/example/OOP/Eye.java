package org.example.OOP;

public class Eye {
    public int eyeNumber;
    private String iris;
    private int nerve;

    Eye(int eyeNumber,String iris,int nerve){
       this.eyeNumber = eyeNumber;
       this.iris = iris;
       this.nerve = nerve;
    }

    public String getIris() {
        return iris;
    }

    public int getNerve() {
        return nerve;
    }
}
