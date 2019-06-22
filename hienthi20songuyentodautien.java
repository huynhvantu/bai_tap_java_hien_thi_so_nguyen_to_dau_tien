package hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class hienthi20songuyentodautien {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Nhap so luong so nguyen to can hien thi");
		int number;
		number = scanner.nextInt();
		int count = 0;
		int N = 2 ;
		
		while(count<number) {
			boolean lasonguyento = true;
			for(int i = 2;i<=N-1;i++) {
				if(N%i==0) {
					lasonguyento = false;
				}
			}
			if(lasonguyento) {
				System.out.println(N);
				count++;
			}
			N++;
		}		
	}	
}
