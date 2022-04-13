package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class simpleAliquot {  // 1933. 간단한 N의 약수

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i < Math.sqrt(num); i++) {
			if(num%i == 0) {
				list.add(i);
				list.add(num/i);
			}
		}
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
