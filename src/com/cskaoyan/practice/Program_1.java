package com.cskaoyan.practice;
/**
 * @author Mitnick
 * @date  2019��5��9�� ����3:16:04
 * @Description TODO forѭ��ʵ��쳲���������
 */
public class Program_1 {
	  
	public static void main(String[] args) {
		int a = 1, b =1;
		for (int i = 1; i <= 10; i++) {
			a = a + b;
			b = b + a;
			System.out.println(a + "\t" + b);
		}
	}
}
