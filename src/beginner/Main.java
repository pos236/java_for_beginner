package beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Pocket Money Calculator for Elementary School
		// Input: space separated Korean, English, Math score
		// Output: Korean English Math Avg
		// p.s.: use 2D array first
		// cons: cannot guess meaning of variables
		//       codes get longer when features are added.
		
		int[][] score = new int[5][3];
//		System.out.println(score.length);
		
		String input = "70 80 80 65 95 70 85 95 90 85 85 90 75 90 100";
		System.out.println("input format: " + input);
		System.out.println("output:");
		System.out.println("=========================================================");
		
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(input);
		int index = 0;
		
		
		while(index < score.length) {
			score[index][0] = sc.nextInt();
			score[index][1] = sc.nextInt();
			score[index][2] = sc.nextInt();
			index++;
		}
		
		index = 0;
		System.out.println("국\t영\t수\t평균\t용돈\t");
		
		while(index < score.length) {
			System.out.print(score[index][0] + "\t"+ score[index][1] + "\t" + score[index][2] + "\t");
			double average = (double)(score[index][0]+score[index][1]+score[index][2])/3;
			
			System.out.print(new java.text.DecimalFormat("#.#").format(average) + "\t");
			System.out.print(getPocketMoney(score[index][0], score[index][1], score[index][2]));
			System.out.println("");
//			System.out.println(new java.text.DecimalFormat("#.#").format(0.1));
			
			index++;
		}
		
		
		sc.close();
		
		System.out.println("=========================================================");
		System.out.println("condition. 1. 평균은 소수점 1자리까지 표기");
		System.out.println("condition. 2. 용돈은 평균80점 이상이면 넘으면 오천원, 90점이면 만원, 100점이면 만오천원. 100점이면 만오천원만 획득");
		System.out.println("contition. 3. 추가로 80점 이상인 과목수마다 500원, 90점 이상인 과목은 1000원, 100점 맞은 과목은 2000원. 한 과목이 백점이면 2000원만 획득");
		System.out.println("tip: 소수점 한자리 표기법은 System.out.println(new java.text.DecimalFormat(\"#.#\").format(여기에더블입력));");
		System.out.println("");
	}

	private static int getPocketMoney(int i, int j, int k) {
		int pocketMoney = 0;
		if(i >= 100)			pocketMoney += 2000;
		else if(i >= 90)		pocketMoney += 1000;
		else if(i >= 80)		pocketMoney += 500;
		
		if(j >= 100)			pocketMoney += 2000;
		else if(j >= 90)		pocketMoney += 1000;
		else if(j >= 80)		pocketMoney += 500;
		
		if(k >= 100)			pocketMoney += 2000;
		else if(k >= 90)		pocketMoney += 1000;
		else if(k >= 80)		pocketMoney += 500;
		
		double average = (double) (i+j+k)/3;
		if(average >=100)			pocketMoney += 15000;
		else if(average >=90)		pocketMoney += 10000;
		else if(average >= 80)		pocketMoney += 5000;
		
		return pocketMoney;
	}
	
	

}
