package com.company;

public class Alg {
    private int[]id;
    public Alg(int n){
        id = new int[n];
        for(int i = 0; i < id.length;i++){
            id[i] = i;
        }
    }
    public void union(int q, int p){
        id[q]= id[p];
        if(treeSize(q)>treeSize(p)){
            for(int i = 0; i < id.length;i++){
                if(id[i]==id[q]){
                    id[i]=id[p];
                }
            }
        }
        else{
            for(int i = 0; i < id.length;i++){
                if(id[i]==id[p]){
                    id[i]=id[q];
                }
            }
        }
    }
    public int treeSize(int q){
        int numOfObjects = 0;
        for(int i = 0; i < id.length;i++){
            if(id[i]==id[q]){
                numOfObjects++;
            }
        }
        return numOfObjects;
    }
    public void printArray(){
        for(int i = 0; i < id.length; i++){
            System.out.println(id[i]);
        }
    }
}
