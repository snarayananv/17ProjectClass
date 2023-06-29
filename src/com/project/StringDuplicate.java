package com.project;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total no = ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter" + n + "no = ");

		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		for(int k=0;k<=a.length;k++) {
			for(int j=k+1;j<=a.length;j++) {
				if(a[k]>a[j]) {
					int t=a[k];
					a[k]=a[j];
					a[j]=t;
				}
			}
			System.out.println(a[k]);
		}

	}
}
