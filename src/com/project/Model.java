package com.project;

import java.util.*;
import java.util.Map.*;

public class Model {
	public static void main(String[] args) {
		String s = "suriya";
		String s1 = "narayanan";
		for (int i = 0; i < s.length(); i++) {
			int co = 1;
			char c = s.charAt(i);
			for (int j = 0; j < s1.length(); j++) {
				char c1 = s1.charAt(j);
				if (c == c1 && c != 0) {
					co++;
					c1 = 0;
				}
			}
			if (co > 1 && c != 0) {
				System.out.println(c + "-->" + co);
			}

		}
	}
}
