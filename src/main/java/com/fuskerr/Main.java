package com.fuskerr;

import com.google.common.collect.AbstractIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AbstractIterator<Object> iterator = new AbstractIterator<>() {
            @Override
            protected Object computeNext() {
                return null;
            }
        };
    }
}