package com.project;

import java.sql.Array;
import java.util.*;
import java.util.Map.*;

public class UppertoLower {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Samsung");
		a.add("Lenovo");
		a.forEach((e) -> {
			System.out.println(e + ",");
		});
	}
}
