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
		
		Score[] score = new Score[5];
//		System.out.println(score.length);
		
		String input = "초6중간 70 80 80 초6기말 65 95 70 초6중간 85 95 90 초6기말 85 85 90 중1중간 75 90 100";
		System.out.println("input format: " + input);
		System.out.println("output:");
		System.out.println("=========================================================");
		
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(input);
		int index = 0;
		
		while(index < score.length) {
			// exercise 1. use class
//			Score tempScore = new Score();
//			tempScore.grade = sc.next();
//			tempScore.korean = sc.nextInt();
//			tempScore.english = sc.nextInt();
//			tempScore.math = sc.nextInt();
//			score[index] = tempScore;
//			index++;
			
			// exercise 2. use constructor
			Score tempScore = new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			score[index] = tempScore;
			index++;
		}
		
		index = 0;
		System.out.println("학년\t국\t영\t수\t평균\t용돈\t");
		
		while(index < score.length) {
			Score tempScore = score[index];
			System.out.print(tempScore.grade + "\t"+ tempScore.korean + "\t" + tempScore.english + "\t" + tempScore.math + "\t");
			// exercise 4. extract average method
//			double average = (double)( tempScore.korean + tempScore.english + tempScore.math)/3;
//			System.out.print(new java.text.DecimalFormat("#.#").format(average) + "\t");
			System.out.print(new java.text.DecimalFormat("#.#").format(tempScore.getAverage()) + "\t");
			
			// exercise 3. extract pocket money mathod
//			System.out.print(getPocketMoney(tempScore.korean, tempScore.english, tempScore.math));
			System.out.print(tempScore.getPocketMoney());
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

	
	
	

}
