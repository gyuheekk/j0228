package t3_while;

// 1~100까지의 합 10항씩의 합을 출력하시오.
/*
  1~10 : 55
  11~20 : 155
  21~30 : 255
  31~40 : 355
  41~50 : 455
  51~60 : 555
  61~70 : 455
  71~80 : 755
  81~90 : 855
  91~100 : 955
 */
public class Test5 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1;
			tot = tot + i;  
			if((i % 10) == 0) {
				System.out.println((i - 9) + " ~ " +i+ " 합은 "+tot+" 입니다.");
				tot = 0;
			}
		}
		
	}
}
