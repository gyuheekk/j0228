package t3_while;

import java.util.Scanner;

// 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되, 한줄에 5개씩 출력하는 프로그램을 만드시오.
public class 숙제_0228_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0, revers = 0;
		
		System.out.print("2자리 숫자를 입력하세요? ");
		su = sc.nextInt();
		
		while(su <= 100) {
			System.out.println(su + "");
			if(su % 5 == 0) {
				System.out.println(); //5개씩 출력하기 위해 줄바꿈
			}
		}
		while(su > 0) {
			revers = revers * 10 + su % 10;
			su /= 10;
		}
		su = revers;
		
		System.out.println(su);
		sc.close();
		
	}
}
