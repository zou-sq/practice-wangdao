package com.cskaoyan.practice;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����2:45:43
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
		
		System.out.println("�ܹ���������" + sum);

//		for (int i = 101; i <= 200; i++) {
//			boolean isPrimeNumber = true;
//			for (int j = 2; j <= Math.sqrt(i); j++)
//				if (i % j == 0) {
//					isPrimeNumber = false;
//					break;   //�ɼӿɲ���
//				}
//			
//			if (isPrimeNumber)
//				System.out.println(i);
//		}
	}
}
