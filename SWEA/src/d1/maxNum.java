package d1;

import java.util.Scanner;

public class maxNum {  // 2068. 최대수 구하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int max = -1;
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				max = Math.max(max, num);
			}
			System.out.println("#" + t + " " + max);
		}
	}

}
