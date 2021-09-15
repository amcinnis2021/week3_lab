/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author soblab
 */
public class NewMain {

    int getLargest(int[] arr){
        int max = arr[0];
        int indx = 0;
        while( indx< arr.length ) {
            if (arr[indx] > max){
                    max = arr[indx];
              }
            indx++;
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        NewMain nc = new NewMain();
        int[] arr = {1, 2 ,3, 4};
        int mx = nc.getLargest(arr);
        System.out.println("The max is: "+mx);
    }

    
}
