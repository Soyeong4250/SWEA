package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabetToNumber {  // 2050.알파벳을 숫자로 변환

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append((str.charAt(i)-64)+" ");
		}
		
		System.out.println(sb.toString().substring(0, sb.toString().length()-1));
	}

}
