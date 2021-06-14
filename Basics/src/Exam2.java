class formula {

	String motorname;
	String manufacturer;
	int model;
	int motorCC;
	int price;

	String buyer;
	String occupation;
	int savings;
	
	int currentsaving() {
		int neededmoney = 331000 - savings;
		return neededmoney;
	}
	String buyersname() {
		return buyer;
	}
	String anongmotor() {
		return motorname;
	}
	int lakasngmotor() {
		return motorCC;
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		
		String[][] Actions = {
				{"Si ", " ay kailangan ng "},
				{" para makabili ng motor na ", " na "},
				{"na", "CC"},
				{" "},	
		};
				
		formula bibili = new formula();
		bibili.buyer = "Eugene";
		bibili.occupation = "IT";
		bibili.savings = 100000;
		
		formula motornabibilhin = new formula();
		motornabibilhin.motorname = "Ninja";
		motornabibilhin.motorCC = 400;
		motornabibilhin.price = 331000;
		
		String pangalanngbuyer = bibili.buyersname();
		int moneyneededtobuymotor = bibili.currentsaving();
		String pangalanngmotor = motornabibilhin.anongmotor();
		int gaanokalakasmotor = motornabibilhin.lakasngmotor();
		
		System.out.println(Actions[0][0] + pangalanngbuyer + Actions[0][1] + moneyneededtobuymotor + Actions[3][0] + Actions[1][0] + pangalanngmotor + Actions[3][0] + Actions[2][0] + Actions[3][0] + gaanokalakasmotor + Actions[3][0] + Actions[2][1]);
	}
}