package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printBackward {  // 1545.거꾸로 출력해 보아요

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for (int i = num; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
