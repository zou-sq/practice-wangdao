package com.cskaoyan.practice;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午2:45:43
 * @Description TODO
 */
public class Program_2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 101;
		while (i <= 200) {
			int j =2;
			boolean isPrimeNumber = true;
			
			while (j <= Math.sqrt(i)) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
				j++;
			}
			
				if (isPrimeNumber) {
					System.out.println(i);
					sum++;
				}
				i++;
		}
		
		System.out.println("总共的素数：" + sum);

//		for (int i = 101; i <= 200; i++) {
//			boolean isPrimeNumber = true;
//			for (int j = 2; j <= Math.sqrt(i); j++)
//				if (i % j == 0) {
//					isPrimeNumber = false;
//					break;   //可加可不加
//				}
//			
//			if (isPrimeNumber)
//				System.out.println(i);
//		}
	}
}
