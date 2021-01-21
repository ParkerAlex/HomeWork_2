package eu.senla.homework_2;

import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {
		
		Rainbow rainbow = new Rainbow();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ÂÂåäèòå ÷èñëî îò 1 äî 7 èëè îò 11 äî 77");
		int number = input.nextInt();
		
		
		String[] color = rainbow.getColor();
		String[] twocolor = rainbow.getTwoColor();
		
		if (number >=1 && number <=7)
		  {
		
				switch(number) {
				  case 1:
					  System.out.println(color[0]);
				break;
				  case 2:
					  System.out.println(color[1]);
				break;
				  case 3:
					  System.out.println(color[2]);
				break;
				  case 4:
					  System.out.println(color[3]);
				break;
				  case 5:
					  System.out.println(color[4]);
				break;
				  case 6:
					  System.out.println(color[5]);
				break;
				  case 7:
					  System.out.println(color[6]);
				break;
				
				}
					
			}
		  else	if (number > 8 && number < 78) {
			  
			  int a = number / 10;
			  int b = number % 10;
			  System.out.println(a + " è " + b);
			  
			  switch(a) {
			  case 1:
				  System.out.print(twocolor[0]  + " - ");
			break;
			  case 2:
				  System.out.print(twocolor[1] + " - ");
			break;
			  case 3:
				  System.out.print(twocolor[2] + " - ");
			break;
			  case 4:
				  System.out.print(twocolor[3] + " - ");
			break;
			  case 5:
				  System.out.print(twocolor[4] + " - ");
			break;
			  case 6:
				  System.out.print(twocolor[5] + " - ");
			break;
			  case 7:
				  System.out.print(twocolor[6] + " - ");
			break;
			
			}
			  
			  switch(b) {
			  case 1:
				  System.out.println(color[0]);
			break;
			  case 2:
				  System.out.println(color[1]);
			break;
			  case 3:
				  System.out.println(color[2]);
			break;
			  case 4:
				  System.out.println(color[3]);
			break;
			  case 5:
				  System.out.println(color[4]);
			break;
			  case 6:
				  System.out.println(color[5]);
			break;
			  case 7:
				  System.out.println(color[6]);
			break;
			
			}
					
				}
		  else {
			     System.out.println("ÂÂåäåíî íåïğàâèëüíîå ÷èñëî");
		       }
					 
	    	}
		
	}


