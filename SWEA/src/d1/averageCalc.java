package d1;

import java.util.Scanner;

public class averageCalc {  // 2071.평균값 구하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int sum = 0;
			
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				sum += num;
			}
//			System.out.println(sum);
			System.out.println("#" + t + " " + Math.round(sum/10.0));
		}
	}

}
