package dialNumber;

import java.util.Scanner;

public class dialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter service pin: ");
		        String servicePin = scanner.nextLine();
		        if (servicePin.equals("*131#")) {
		            System.out.println("0.Sh20(30mins,3hrs) ");
		            System.out.println("1.Sh50(40Mins+50SMS,24hrs)");
		            System.out.println("2.Okoa Easy Sh100(100mins,2days)");
		            System.out.println("3.Okoa 250");
		            System.out.println("4.Okoa 100");
		            System.out.println("5.Okoa 50");
		            System.out.println("6.Okoa 20");
		            System.out.println("7.Okoa 10");
		            System.out.println("0. More");
		            System.out.println("");
		            System.out.println("Enter option");
		            int option = scanner.nextInt();
		            System.out.println("-----------------------------------");
		            if (option == 0) {
		                System.out.println("9.Okoa Internet");
		                System.out.println("10.Okoa Minutes");
		                System.out.println("11.Okoa SMS");
		                System.out.println("#.Lipa Okoa");
		                System.out.println("0.Back");
		                System.out.println("");
		                System.out.println("Enter option");
			            int newOption= scanner.nextInt();
			            System.out.println("-----------------------------------");
		                if (newOption == 0) {
		                    main(args);
		                }
		            }
		        
		    
		}
		        else {
		        	System.out.println("Invalid Service pin.Try again");
		        	main(args);
		        }

	}
}
