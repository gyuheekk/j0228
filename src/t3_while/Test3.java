package t3_while;

// 1~100까지의 홀수합
public class Test3 {
	public static void main(String[] args) {
		int i = -1, tot = 0;
		
		while(i < 99) {   //홀수합을 수할 땐, 구할 비교치에서 가장 작은 정수로 설정 (ex. 100까지의 합이면 비교치는 i<99) 
			i = i + 2;      
			tot = tot + i;  
		}
		
		System.out.println("1~100까지의 홀수합은? " + tot);
	}
}
