package d1;

import java.util.Scanner;

public class stamp {  // 2046.스탬프 찍기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append("#");
		}
		
		System.out.println(sb.toString());
	}

}
