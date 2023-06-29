package com.project;

import java.util.*;
import java.util.Scanner;
import java.util.Set;

import sun.security.util.Length;

public class Reverse {

	public static void main(String[] args) {

		String s = "welcome to java class";
		// String[] sp=s.split(" ");
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			// String c1=sp[i];
			char c = s.charAt(i);
			if (c == 'l') {

				continue;

			}
			//c = '\t';
			s1 = s1 + c;
		}
		System.out.println(s1);
	}

}
