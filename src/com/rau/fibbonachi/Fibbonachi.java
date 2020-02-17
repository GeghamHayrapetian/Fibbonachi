package com.rau.fibbonachi;

import java.util.Iterator;

public class Fibbonachi implements Iterable <Integer> {
    private Integer n1=0;
    private Integer n2=1;
    @Override
    public Iterator<Integer> iterator() {
        return iterator ;
    }


    private Iterator<Integer> iterator = new Iterator<>() {
        @Override
        public boolean hasNext() {
            return true;
        }
        @Override
        public Integer next() {
           Integer number= n1+n2;
            n1=n2;
            n2=number;
            return number;
        }
    };

}
