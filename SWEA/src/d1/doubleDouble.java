package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doubleDouble {  // 2019.더블더블

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 1;
		
		for (int i = 0; i <= num; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}
	}

}
