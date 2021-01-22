package eu.senla.homework_2;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Rainbow rainbow = new Rainbow();
		
		Scanner input = new Scanner(System.in);
		
	//	System.out.println("ÂÂåäèòå ÷èñëî îò 1 äî 7 èëè îò 12 äî 76");
		System.out.println("Vvedite chislo ot 1 do 7 ili ot 12 do 76");
		int number = input.nextInt();
		
		
		String[] color = rainbow.getColor();
		String[] twocolor = rainbow.getTwoColor();
		
		  int a = number / 10;
		  int b = number % 10;
		
		    if (a != b) 
		    {		  
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
				  else	if (number > 11 && number < 77) {
					  			  
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
							
						} else {
								  //System.out.println("ÂÂåäåíî íåïğàâèëüíîå ÷èñëî");
								  System.out.println("Vvedeno nepravilno chislo");
				               }
				
		     } else if (a == 0){
		    	 System.out.println("Vvedeno nepravilno chislo");
				
				 
			 }  else { 
						//System.out.println("ÂÂåäåíî äâîéíîå îäèíàêîâîå ÷èñëî, ïîëóöâåòà áûòü íå ìîæåò");
						  System.out.println("Vvedeno dvoinoe odinakovoe chislo, polucveta ne bivaet");
					 }
			}
	    	
	    }
	


