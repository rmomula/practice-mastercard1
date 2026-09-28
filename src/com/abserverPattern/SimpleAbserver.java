package com.abserverPattern;

public class SimpleAbserver implements Abserver{
    private int val;
    private Subject simpleSubject;


    public SimpleAbserver(int val, Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerAbserver(this);
    }
    public void update(int val){
        this.val=val;
    }
    public void display(){
        System.out.println("Valuue = "+val);
    }
}
