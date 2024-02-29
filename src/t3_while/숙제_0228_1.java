package t3_while;

// 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오.
// 단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
// 이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
public class 숙제_0228_1 {
	public static void main(String[] args) {
		int i = 0, num2 = 0, num3 = 0, num5 = 0, sum2= 0, sum3 = 0, sum5 = 0;
		
		i = 1;
		while (i <= 100) {
			if(i % 2 == 0) {
				num2 = num2 + 1;
				sum2 += i;
			}
			else if(i % 3 == 0) {
				num3 = num3 + 1;
				sum3 += i;
			}
			else if(i % 5 == 0) {	
				num5 = num5 + 1;
				sum5 += i;
			}
			i = i + 1;
		}
	
		System.out.println("2의 배수 개수는 "+num2+" 개입니다.");
		System.out.println("3의 배수 개수는 "+num3+" 개입니다.");
		System.out.println("5의 배수 개수는 "+num5+" 개입니다.");
		
		System.out.println("2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과. " + (sum2+sum3-sum5) );
	}
}
