package guessingGame;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String userInput = "";
        Scanner userSel = new Scanner(System.in);
        String generatedNumber = Integer.toString((int)(100+900*Math.random()));
        StringBuilder printNumber = new StringBuilder("XXX");
        StringBuilder win = new StringBuilder("OOO");
        
		while(true)
        {
			System.out.println(generatedNumber);
			System.out.println(printNumber);
            System.out.println("Enter 3 digit number"); 

            try {
            	userInput = userSel.next();
            } catch (Exception e) {
                System.out.println("bad input");
                userSel.next();
            }
            
            
            for (int i = 0; i < generatedNumber.length(); i++) {
            	printNumber.setCharAt(i, 'X');
            	if (generatedNumber.charAt(i) == userInput.charAt(i)) {
					printNumber.setCharAt(i, 'O');					
				} else {
					for (int j = 0; j < generatedNumber.length(); j++) {
						if (generatedNumber.charAt(i) == userInput.charAt(j)) {
							printNumber.setCharAt(j, '?');					
						}
					}
				}
			}
            
            if (printNumber.compareTo(win)==0) {
            	System.out.println("You found the number!");
            	
            	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            	break;
            	
            }

            
        }

	}

}