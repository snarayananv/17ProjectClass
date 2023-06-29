package com.project;

public class PrintDuplicateInTwoString {

	public static void main(String[] args) {
		String s = "suriya";
		String s1 = "narayanan";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = 0; j < s1.length(); j++) {
				char c1 = s1.charAt(j);
				if (c == c1) {
					s2 = s2 + c1;
				}
			}
		}
		int[] a = new int[256];
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			int n = c - 0;
			a[n]++;
		}
		for (int i = 0; i < 256; i++) {
			if (a[i] != 0) {
				System.out.println((char) i + "-->" + a[i]);
			} 
		}
	}
}
