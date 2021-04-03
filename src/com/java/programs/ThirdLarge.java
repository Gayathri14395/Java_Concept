package com.java.programs;

public class ThirdLarge {
	public static void main(String[] args) {
		int a[] = { -30, -40, 40, 30, 100 };
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				int temp = 0;
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int k = 0; k <= a.length - 1; k++) {
			System.out.println(a[k]);
		}
		System.out.println("The 3rd maximum number is" + a[a.length - 2]);
	}
}
