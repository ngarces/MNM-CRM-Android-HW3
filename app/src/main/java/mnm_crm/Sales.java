package mnm_crm;

public class Sales {
	
	String whatWasSold;
	int howMuchWasSold;
	double profit;
	
	Sales(String what, int how, double profit){
		setWhatWasSold(what);
		setHowMuchWasSold(how);
		setProfit(profit);
		
	}
	
	//setter for what was sold
	
	void setWhatWasSold(String what) {
		whatWasSold = what;
	}
	
	//getter for what was sold
	
	String getWhatWasSold() {
		return whatWasSold;
	}
	
	//setter for how much was sold
	void setHowMuchWasSold(int how) {
		howMuchWasSold = how;
		
	}
	
	//getter for how much was sold
	int getHowMuchWasSold() {
		return howMuchWasSold;
	}
	
	//setter for profit
	void setProfit(double prof) {
		profit = prof;
	}
	
	//getter for profit
	double getProfit() {
		return profit;
	}
	
	//print out sales object.
	void printSales() {
		System.out.println("You sold " + howMuchWasSold  
				            + " of " + whatWasSold + " for " + profit);
	}
	

}
