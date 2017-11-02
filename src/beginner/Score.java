package beginner;

public class Score {
	
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
		if(korean >= 100)			pocketMoney += 2000;
		else if(korean >= 90)		pocketMoney += 1000;
		else if(korean >= 80)		pocketMoney += 500;
		
		if(english >= 100)			pocketMoney += 2000;
		else if(english >= 90)		pocketMoney += 1000;
		else if(english >= 80)		pocketMoney += 500;
		
		if(math >= 100)			pocketMoney += 2000;
		else if(math >= 90)		pocketMoney += 1000;
		else if(math >= 80)		pocketMoney += 500;
		
		double average = (double) (korean+english+math)/3;
		if(average >=100)			pocketMoney += 15000;
		else if(average >=90)		pocketMoney += 10000;
		else if(average >= 80)		pocketMoney += 5000;
		
		return pocketMoney;
	}
	
	double getAverage() {
		return (double)(korean + english +math)/3;
	}
}
