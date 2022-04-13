package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calendar {  // 2056.연월일 달력

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] lastday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int t = 1; t <= T; t++) {
			String date = br.readLine();
			
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			
			int iyear = Integer.parseInt(year);
			int imonth = Integer.parseInt(month);
			int iday = Integer.parseInt(day);
			
			if(imonth < 1 || 12 < imonth || iday < 1 || lastday[imonth-1] < iday) {
				System.out.println("#" + t + " " + -1);
			}else {
				System.out.println("#" + t + " " + year + "/" + month + "/" + day);
			}
		}
	}

}
