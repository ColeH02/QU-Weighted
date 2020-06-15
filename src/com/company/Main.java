package com.company;

public class Main {

    public static void main(String[] args) {
	    Alg alg = new Alg(9);
	    alg.union(3,4);
        alg.union(1,4);
        alg.union(5,4);
        alg.union(2,4);
        alg.printArray();
    }
}
