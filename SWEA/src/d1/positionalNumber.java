package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class positionalNumber {  // 2058.자릿수 더하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int sum = 0;
		for (int i = 0; i < N.length(); i++) {
			sum += N.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
