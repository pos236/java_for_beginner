package beginner;

public class MiddleScore extends Score{
	
	int history;
	int science;
	
	public MiddleScore(String grade, int korean, int english, int math) {
		super(grade, korean, english, math);
	}
	
	public MiddleScore(String grade, int korean, int english, int math, int history, int science) {
		super(grade, korean, english, math);
		this.history = history;
		this.science = science;
	}
	
	public int getHistory() {
		return history;
	}
	
	public int getScience() {
		return science;
	}

	@Override
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
		
		if(history >= 100)			pocketMoney += BONUS_SUB_100;
		else if(history >= 90)		pocketMoney += BONUS_SUB_90;
		else if(history >= 80)		pocketMoney += BONUS_SUB_80;
		
		if(science >= 100)			pocketMoney += BONUS_SUB_100;
		else if(science >= 90)		pocketMoney += BONUS_SUB_90;
		else if(science >= 80)		pocketMoney += BONUS_SUB_80;
		
		double average = getAverage();
		if(average >=100)			pocketMoney += BONUS_AVG_100;
		else if(average >=90)		pocketMoney += BONUS_AVG_90;
		else if(average >= 80)		pocketMoney += BONUS_AVG_80;
		
		return pocketMoney;
	}

	@Override
	double getAverage() {
		return (double)(korean + english + math + history + science)/5;
	}
}
