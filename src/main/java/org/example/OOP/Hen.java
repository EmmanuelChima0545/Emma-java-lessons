package org.example.OOP;

public class Hen extends Animal {
    public String feather;
    final public int leg = 2;

    Hen(Head head, Body body, String feather){
        super(head,body);
        this.feather = feather;
    }

    public static void main(String[] args) {
        Eye eye = new Eye(2, "Very sharp eye sight", 10000);

        String layEgg = "Hen's give birth by laying eggs through their anus";
        Anus anus = new Anus(layEgg) ;
        String gizzard = "Hen's have just one gizzard each";
        int wing = 2;
        int thigh = 2;
        int liver = 1;
        Body body = new Body(gizzard,anus,wing,thigh,liver);
        String beak = "Hen has a special kind of beak";
        String comb = "The comb of a hen is red";
        Head head = new Head(eye,beak,comb);
        String feather = "Hen have white feather";

        Hen hen = new Hen(head,body,feather);


        System.out.println("Comment on the iris: " + hen.head.eye.getIris());
        System.out.println("Eye count: " + hen.head.eye.eyeNumber);
        System.out.println("Feather colour: " + hen.feather);
        System.out.println("How does the hen lay egg? " + hen.body.getAnus().getLayEgg());

    }




}
