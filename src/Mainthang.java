import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Mainthang {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input total-jumps. When finished, enter <'x'>.");
		int counterTJ = 0;
		String timesTJ = in.next();
		
		//TJ for total jumps
		
		List<Integer> totalJumpsMin = new ArrayList<Integer>();
		List<Integer> totalJumpsSec = new ArrayList<Integer>();
				
				
		while(!timesTJ.equalsIgnoreCase("x")){
			counterTJ += 1;
			String[] timesTJsplit = timesTJ.split(":");
			totalJumpsMin.add(Integer.parseInt(timesTJsplit[0]));
			totalJumpsSec.add(Integer.parseInt(timesTJsplit[1]));
			timesTJ = in.next();
		}
		
		System.out.println("Input preferred countdown");
		int countdown = in.nextInt();
		
		
		
		int counterfiller = 1;
		int subnumber = 1;
		int arraylistcounter;
		
		
		System.out.println("Done and done. Check D:\\Downloads for hoose of.srt");
		System.setOut(new PrintStream(new FileOutputStream("D:\\Downloads\\hoose of.srt")));
		
		while (counterfiller <= counterTJ){
			arraylistcounter = counterfiller - 1;
			int starttimeSec = totalJumpsSec.get(arraylistcounter) - countdown;
			int starttimeMin = totalJumpsMin.get(arraylistcounter);
			int endtimeSec = totalJumpsSec.get(arraylistcounter);
			int endtimeMin = totalJumpsMin.get(arraylistcounter);
			
			//A is subtitles start time; B is subtitles end time
			int secLimitedA = 0;
			int minLimitedA = 0;
			int secLimitedB = 0;
			int minLimitedB = 0;
			
			
			int countdownfiller = 0;
			
			
			while (starttimeSec < endtimeSec){
				
				//PRINTS OUT THE SUBTITLE NUMBER
				System.out.println(subnumber);
				
				if (starttimeSec < 0){
					secLimitedA = starttimeSec + 60;
					minLimitedA = starttimeMin - 1;
							
				} else {
					secLimitedA = starttimeSec;
					minLimitedA = starttimeMin;
				}
				
				secLimitedB = secLimitedA + 1;
				minLimitedB = minLimitedA;
				
				if (secLimitedB == 60){
					minLimitedB += 1;
					secLimitedB = 0;
				}
				
				
				
				
				
				String secStringA;
				String minStringA;
				String secStringB;
				String minStringB;
				
				//ADDS LEADING ZEROES TO NUMBERS < 10
				if(minLimitedA < 10){
					minStringA = "0" + String.valueOf(minLimitedA);
				} else {
					minStringA = String.valueOf(minLimitedA);
				}
				
				if(secLimitedA < 10){
					secStringA = "0" + String.valueOf(secLimitedA);
				} else {
					secStringA = String.valueOf(secLimitedA);
				}
				
				if(minLimitedB < 10){
					minStringB = "0" + String.valueOf(minLimitedB);
				} else {
					minStringB = String.valueOf(minLimitedB);
				}
				
				if(secLimitedB < 10){
					secStringB = "0" + String.valueOf(secLimitedB);
				} else {
					secStringB = String.valueOf(secLimitedB);
				}
				
				
				
				
				//THE ONLY STRING PRINTER YOU NEEEEEED RIGHT THIS WAY vvvv
				System.out.println("00:" + minStringA + ":" + secStringA + ",000"
						+ " --> " + "00:" + minStringB + ":" + secStringB + ",000");
				
				//COUNTDOWN PRINTER w/ space
				System.out.println(countdown - countdownfiller);
				System.out.println("");
				
				
				
				starttimeSec += 1; 
				
				countdownfiller += 1;
				
				subnumber += 1;
			}
			
			counterfiller += 1;
			
			
		}
		
		
		
		/*
		 * 
		
		if (starttimeSec < 0){
				starttimeSec = starttimeSec + 60;
				starttimeMin -= 1;
			}
		
		int listcounter = 1;
		int arraylistcounter = 0;
		
		while ((listcounter - 1) < counterTJ){
			arraylistcounter = listcounter - 1;
			System.out.println(listcounter);
			
			int starttimeSec = totalJumpsSec.get(arraylistcounter) - 10;
			int starttimeMin = totalJumpsMin.get(arraylistcounter);
			int endtimeSec = totalJumpsSec.get(arraylistcounter);
			int endtimeMin = totalJumpsMin.get(arraylistcounter);
			
			int countnumbers = 0;
			
			while(countnumbers < countdown){
				System.our.println(listcounter);
			}
			
			
			
			//end time maker, because that shit can go over 60 and like DAMN
			if(endtimeSec >= 60){
				endtimeSec = endtimeSec - 60;
				endtimeMin = endtimeMin + 1;
			}
			
			
			//NOW THE PRINTING BEGIIIINS
			
			//printers, cause fuck copy pasting System.out.println
			
			String starttimeSecSt;
			String starttimeMinSt;
			String endtimeSecSt;
			String endtimeMinSt;
			
			if (starttimeSec < 10){
				starttimeSecSt = "0" + String.valueOf(starttimeSec);
			} else {
				starttimeSecSt = String.valueOf(starttimeSec);
			}
			
			if (starttimeMin < 10){
				starttimeMinSt = "0" + String.valueOf(starttimeMin);
			} else {
				starttimeMinSt = String.valueOf(starttimeMin);
			}
			
			if (endtimeSec < 10){
				endtimeSecSt = "0" + String.valueOf(endtimeSec);
			} else {
				endtimeSecSt = String.valueOf(endtimeSec);
			}
			
			if (endtimeMin < 10){
				endtimeMinSt = "0" + String.valueOf(endtimeMin);
			} {
				endtimeMinSt = String.valueOf(endtimeMin);
			}
			
			
			System.out.println("00:" + starttimeMinSt + ":" + starttimeSecSt + ",000"
					+ " --> " + "00:" + endtimeMinSt + ":" + endtimeSecSt + ",000");
			
			
			
			
			/*
			if(endtimeSec < 10 && starttimeMin < 10){
			 
				System.out.println("00:" + starttimeMin + ":" +starttimeSec + ",000"
						+ " --> " + "00:" + endtimeMin + ":" + endtimeSec + ",000");
			}
			
			if(starttimeSec < 10){
				System.out.println("00:" + starttimeMin + ":" +starttimeSec + ",000"
						+ " --> " + "00:" + endtimeMin + ":" + endtimeSec + ",000");
			}
			
			
		
			
			listcounter += 1;
		}
		*/
		
	}
}
