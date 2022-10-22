package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao canh a: ");
		int a = sc.nextInt();
		System.out.print("Nhap vao canh b: ");
		int b = sc.nextInt();
		System.out.print("Nhap vao canh c: ");
		int c = sc.nextInt();
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("a, b, c la ba canh cua mot tam giac");
		}else {
			System.out.println("a, b, c khong phai la ba canh cua mot tam giac");
		}
	}

}
