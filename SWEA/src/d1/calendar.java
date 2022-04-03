package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calendar {  // 2056.연월일 달력

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String date = br.readLine();
			
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			
			int iyear = Integer.parseInt(year);
			int imonth = Integer.parseInt(month);
			int iday = Integer.parseInt(day);
			
			if(imonth < 1 || 12 < imonth) {
				System.out.println("#" + t + " " + -1);
				continue;
			}else if(imonth == 2){
				if(iday < 1 || 28 < iday) {
					System.out.println("#" + t + " " + -1);
					continue;
				}
			}else if(imonth == 1 || imonth == 3 || imonth == 5 || imonth == 7 || imonth == 8 || imonth == 10 || imonth == 12){
				if(iday < 1 || 31 < iday) {
					System.out.println("#" + t + " " + -1);
					continue;
				}
			}else {
				if(iday < 1 || 30 < iday) {
					System.out.println("#" + t + " " + -1);
					continue;
				}
			}
			
			System.out.println("#" + t + " " + year + "/" + month + "/" + day);
		}
	}

}
