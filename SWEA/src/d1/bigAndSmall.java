package d1;

import java.util.Scanner;

public class bigAndSmall {  // 2070.큰 놈,작은 놈,같은 놈

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			String result = "";
			
			if(first > second) {
				result = ">";
			}else if(first == second) {
				result = "=";
			}else {
				result = "<";
			}
			
			System.out.println("#" + t + " " + result);
		}

	}

}
