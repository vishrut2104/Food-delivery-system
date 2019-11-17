import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Italian extends function {
    Scanner s = new Scanner(System.in);

    @Override
    public void displaymenu() throws IOException{
        int num;
        do{
        System.out.println("NOTE: Each dish costs Rs.100 and min. order acceptable is of Rs.200.");
            System.out.println("");
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("1.Veg special Pizza");
            System.out.println("2.Chicken dominator pizza");
            System.out.println("3.Deluxe pizza");
            System.out.println("4.Red/White sauce pasta");
            System.out.println("5.Italian wrap");
            System.out.println("6.Exit ");
         num = s.nextInt();
        s.nextLine();

            switch (num) {
                case 1:write("1.Veg special Pizza");
                bill=bill+100;
                break;

                case 2:write("2.Chicken dominator pizza");
                    bill=bill+100;
                    break;

                case 3:write("3.Deluxe pizza");
                    bill=bill+100;
                    break;

                case 4:write("4.Red/White sauce pasta");
                    bill=bill+100;
                    break;

                case 5:write("5.Italian wrap");
                    bill = bill + 100;
                    break;
                case 6:
                    break;
            }
        } while (num != 6);
    }




    public void confirm() throws customexception,IOException {
        int flag=1;
while(flag!=0){
        System.out.println("Would you like to confirm your order? \n Please write Yes or No. \n ");
        String answer = s.nextLine();
        if (answer == null || answer.isEmpty()) System.out.println("Please type yes or no");
        for (char c : answer.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new customexception("input contains number.");
             }
            }
        if (answer.equalsIgnoreCase("yes")) {
                billgenerator();flag=0;
            } else if (answer.equalsIgnoreCase("no")) {
                displaymenu();flag=0;
            }
        }
    }
}
