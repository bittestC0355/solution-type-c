package problem04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static String[] array;
	static int from,to,count,totalCount;
	static long[] time;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		from = scan.nextInt();
		to = scan.nextInt();
		count = scan.nextInt();
		totalCount = scan.nextInt();
		array = new String[totalCount];
		time = new long[totalCount];
		makeRandomCombination();
		
	}
	public static void makeRandomCombination() {
		Random random = new Random();
		int index = 0;
		for(int i=from;i<=to;i++) {
			StringBuffer sb = new StringBuffer();
			int prev = 0;
			for(int j=0;j<count;j++) {
				sb.append(i+"x");
				int randomValue = random.nextInt(9)+1;
				if(randomValue==prev) {
					if(randomValue+1 < 10) {
						randomValue++;
					}else {
						randomValue--;
					}
				}
				array[index] = i+"x"+randomValue;
				index++;
				sb.append(randomValue)
				  .append(",");
				prev = randomValue;
			}
			System.out.println(sb.toString());
		}
		int prevNum = 0;
		int number = 1;
		boolean[] select = new boolean[totalCount];
		for(int i=0;i<array.length;i++) {
			long start = System.currentTimeMillis();
			int newRandomNumber = random.nextInt(totalCount-1)+1;
			if(newRandomNumber==prevNum) {
				if(newRandomNumber+1 < totalCount) {
					newRandomNumber++;
				}else {
					newRandomNumber--;
				}
			}
			int timeindex = 0;
			System.out.println(number+"."+"  "+array[newRandomNumber]+" ?");
			number++;
			String[] split = array[newRandomNumber].split("");
			int result = Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
			System.out.println(result);
			long end = System.currentTimeMillis();
			time[timeindex] = end-start;
			timeindex++;
			prevNum = newRandomNumber;
			
		}
		
		
		
	
		
	}
}