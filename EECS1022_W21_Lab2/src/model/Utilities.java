package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";

		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double taxed = 0.0;
		String filStat = "";
		String part1 = "";
		String part2 = "";
		String part3 = "";
		String format = "";
		
		if (status == 1) {
			filStat = "Single Filing: ";
			if (income <= 8350) {
				taxed = 0.1*income;
				format = String.format("%.2f", taxed);
				part1 = "Part I: $" + format;
			}else if (income > 8350 && income <=33950) {
				part1 ="Part I: $835.00, ";
				taxed =(income - 8350)*0.15;
				format = String.format("%.2f", taxed);
				part2 = "Part II: $" + format;
				taxed += 835.00;
			}else if (income > 33950) {
				part1 ="Part I: $835.00, ";
				part2 = "Part II: $3840.00, ";
				taxed = (income - 33950)*0.25;
				format = String.format("%.2f", taxed);
				part3 = "Part III: $" + format;
				taxed += 835 + 3840;
			}
		}else if (status == 2) {
			filStat = "Married Filing: ";
			if (income <= 16700) {
				taxed = 0.1*income;
				format = String.format("%.2f", taxed);
				part1 = "Part I: $" + format;
			}else if (income >16700 && income <=67900) {
				part1 = "Part I: $1670.00, ";
				taxed = (income - 16700)*0.15;
				format = String.format("%.2f", taxed);
				part2 = "Part II: $" + format;
				taxed += 1670;
			}else if (income > 67900) {
				part1 = "Part I: $1670.00, ";
				part2 = "Part II: $7680.00, ";
				taxed = (income - 67900)*0.25;
				format = String.format("%.2f", taxed);
				part3 = "Part III: $" + format;
				taxed += 1670 + 7680;
			}
		}
		format = String.format("%.2f", taxed);
		result = filStat + "$" + format+" ("+ part1 + part2 + part3 +")";
		
		if (status !=1 && status !=2) {
			result ="Illegal Status: " + status;
		}

		/* Your implementation ends here. */

		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int countP1 = 0;
		int countP2 = 0;
		String round1 = "";
		String round2 = "";
		String hand1 = "";
		String losHand1 = "";
		String hand2 = "";
		String losHand2 = "";
		
		if(p1r1 =='R') {
			if(p2r1 == 'S') {
				countP1 += 1;
				round1 = p1 + " wins (";
				hand1 = "R";
				losHand1 = "S";
			}
			else if (p2r1 == 'P') {
				countP2 += 1;
				round1 = p2 + " wins (";
				hand1 = "P";
				losHand1 = "R";
			}
			else if (p2r1 == 'R') {
				round1 = "Tie (";
				hand1 = "R";
				losHand1 = "R";
			}
		}
		else if (p1r1 =='S') {
			if(p2r1 == 'P') {
				countP1 += 1;
				round1 = p1 + " wins (";
				hand1 = "S";
				losHand1 = "P";
			}
			else if (p2r1 == 'R') {
				countP2 += 1;
				round1 = p2 + " wins (";
				hand1 = "R";
				losHand1 = "S";
			}
			else if (p2r1 == 'S') {
				round1 = "Tie (";
				hand1 = "S";
				losHand1 = "S";
			}
		}
		else if (p1r1 =='P') {
			if(p2r1 == 'R') {
				countP1 += 1;
				round1 = p1  + " wins (";
				hand1 = "P";
				losHand1 = "R";
			}
			else if (p2r1 == 'S') {
				countP2 += 1;
				round1 = p2 + " wins (";
				hand1 ="S";
				losHand1 = "P";
			}
			else if (p2r1 == 'P') {
				round1 = "Tie (";
				hand1 = "P";
				losHand1 = "P";
			}
		}
		
		if(p1r2 =='R') {
			if(p2r2 == 'S') {
				countP1 += 1;
				round2 = p1 + " wins (";
				hand2 = "R";
				losHand2 = "S";
			}
			else if (p2r2 == 'P') {
				countP2 += 1;
				round2 = p2 + " wins (";
				hand2 = "P";
				losHand2 = "R";
			}
			else if (p2r2 == 'R') {
				round2 = "Tie (";
				hand2 = "R";
				losHand2 = "R";
			}
		}
		else if (p1r2 =='S') {
			if(p2r2 == 'P') {
				countP1 += 1;
				round2 = p1 + " wins (";
				hand2 = "S";
				losHand2 = "P";
			}
			else if (p2r2 == 'R') {
				countP2 += 1;
				round2 = p2 + " wins (";
				hand2 = "R";
				losHand2 = "S";
			}
			else if (p2r2 == 'S') {
				round2 = "Tie (";
				hand2 = "S";
				losHand2 = "S";
			}
		}
		else if (p1r2 =='P') {
			if(p2r2 == 'R') {
				countP1 += 1;
				round2 = p1 + " wins (";
				hand2 = "P";
				losHand2 = "R";
			}
			else if (p2r2 == 'S') {
				countP2 += 1;
				round2 = p2 + " wins (";
				hand2 = "S";
				losHand2 = "P";
			}
			else if (p2r2 == 'P') {
				round2 = "Tie (";
				hand2 = "P";
				losHand2 = "P";
			}
		}
		
		String wins = "";
		if(countP1 > countP2) {
			wins = p1 + " wins! ";
		}
		else if (countP2 >countP1) {
			wins =p2 +" wins! " ;
		}
		else {
			wins = "Tie! ";
		}
		result = "Game over: " + wins + "[Round 1: "+ round1 + hand1 + " vs. "+ losHand1 +") ; Round 2: " + round2 + hand2 +
				" vs. "+ losHand2 + ")]";
		/* Your implementation ends here. */

		return result;
	}
}
