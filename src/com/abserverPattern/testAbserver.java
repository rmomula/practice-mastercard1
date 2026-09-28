package com.abserverPattern;

public class testAbserver {
    public static void main(String[] args){
        SimpleAbserver sa = new SimpleAbserver(3, new Subject());
        sa.display();
    }
}
