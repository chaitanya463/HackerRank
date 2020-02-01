package com.hackerrank.chaitanya;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
public class JumpClouds {
	
	static int jumpingOnClouds(int[] c) {
        int count = 0;
        int n = c.length;
        for(int i =0; i < n; i++) {
        	System.out.println("count = " + count);
        	System.out.println(" index i = " + i);
     //   	System.out.println("length n = "+ n);
            if (i < n-2 && c[i+2] == 0) {
                i++;
                System.out.println("after +2 = "+ i);
            }
            count++;
            System.out.println("count 2 = " + count);
            System.out.println("");
        }
        return count;
    }
	public static void main(String...strings) {
		System.out.println(JumpClouds.jumpingOnClouds(new int[] {0,0,1,0,0,1,0}));
	}
}
