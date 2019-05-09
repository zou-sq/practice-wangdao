package com.cskaoyan.practice;
/**
 * @author Mitnick
 * @date  2019年5月9日 下午3:16:04
 * @Description TODO for循环实现斐波拉契数列
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
