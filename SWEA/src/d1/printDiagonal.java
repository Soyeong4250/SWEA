package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printDiagonal {  // 2027. 대각선 출력하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("#++++\n" +
						  "+#+++\n" +
						  "++#++\n" +
						  "+++#+\n" + 
						  "++++#\n");
	}

}
