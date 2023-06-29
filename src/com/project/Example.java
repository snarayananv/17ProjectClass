package com.project;

import java.util.*;
import java.util.Map.*;

public class Example {
	public static void main(String[] args) {
		String s = "hai23";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			try {
				int a=Integer.parseInt(s1[i]);
				System.out.println(a);		
			} catch(Exception e) {
			}
		}
	}
}