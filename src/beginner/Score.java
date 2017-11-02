package beginner;

public class Score {
	
	static int BONUS_SUB_80 = 500;
	static int BONUS_SUB_90 = 1000;
	static int BONUS_SUB_100 = 2000;
	
	static int BONUS_AVG_80 = 5000;
	static int BONUS_AVG_90 = 10000;
	static int BONUS_AVG_100 = 15000;
	
	String grade;
	int korean;
	int english;
	int math;
	
	// exercise 2. constructor
	public Score(String grade, int korean, int english, int math) {
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	// exercise 3. extract method
	// public, private
	int getPocketMoney() {
		int pocketMoney = 0;
		if(korean >= 100)			pocketMoney += BONUS_SUB_100;
		else if(korean >= 90)		pocketMoney += BONUS_SUB_90;
		else if(korean >= 80)		pocketMoney += BONUS_SUB_80;
		
		if(english >= 100)			pocketMoney += BONUS_SUB_100;
		else if(english >= 90)		pocketMoney += BONUS_SUB_90;
		else if(english >= 80)		pocketMoney += BONUS_SUB_80;
		
		if(math >= 100)			pocketMoney += BONUS_SUB_100;
		else if(math >= 90)		pocketMoney += BONUS_SUB_90;
		else if(math >= 80)		pocketMoney += BONUS_SUB_80;
		
		double average = getAverage();
		if(average >=100)			pocketMoney += BONUS_AVG_100;
		else if(average >=90)		pocketMoney += BONUS_AVG_90;
		else if(average >= 80)		pocketMoney += BONUS_AVG_80;
		
		return pocketMoney;
	}
	
	double getAverage() {
		return (double)(korean + english +math)/3;
	}
}
