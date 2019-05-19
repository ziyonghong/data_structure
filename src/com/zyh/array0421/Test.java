package com.zyh.array0421;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public abstract class Test {

    public static void main(String[] args) {
    	
    	
        long b1 = System.currentTimeMillis();
        HashMap<Integer,Integer > hash=new HashMap<>();
        for(int i=0;i<10000000;i++){
        	hash.put(i, i);
        }
        
       /* ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i =0; i < 10000000; i++){
            list1.add(i);
        }*/
        long e1 = System.currentTimeMillis();

        System.out.println("时间为 : " + (e1-b1));

        long b2 = System.currentTimeMillis();
        Hashtable<Integer,Integer > hash1=new Hashtable<>();
        for(int i=0;i<10000000;i++){
        	hash1.put(i, i);
        }
        /*ArrayList<Integer> list2 = new ArrayList<Integer>(10000000);
        for(int i =0; i < 10000000; i++){
            list2.add(i);
        }*/
        long e2 = System.currentTimeMillis();

        System.out.println("时间为 : " + (e2-b2));
    }

}
