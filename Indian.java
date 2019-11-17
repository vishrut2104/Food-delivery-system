import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Indian extends function {
    BufferedReader ss = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void displaymenu() throws IOException {
        do {
            System.out.println("NOTE: Each dish costs Rs.100 and min. order acceptable is of Rs.200.");
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("1.Paneer lababdar");
            System.out.println("2.Chole Bhature ");
            System.out.println("3.Roti/Naan ");
            System.out.println("4.Butter Chicken ");
            System.out.println("5.Mix Veg ");
            System.out.println("6.Exit");
            num = Integer.parseInt(ss.readLine());


            switch (num) {
                case 1: write("1.Paneer lababdar");
                    bill=bill+100;
                    break;
                case 2: write("2.Chole Bhature");
                    bill=bill+100;
                    break;
                case 3:write("3.Roti/Naan ");
                    bill=bill+100;
                    break;
                case 4:write("4.Butter Chicken ");
                    bill=bill+100;
                    break;
                case 5:write("5.Mix Veg ");
                    bill = bill + 100;
                    break;
                case 6:
                    break;
            }
        } while (num != 6);
    }

    public void confirm() throws customexception, IOException {
        int flag = 1;
        while (flag != 0) {
            System.out.println("Would you like to confirm your order? \n Please write Yes or No. \n ");
            String answer = ss.readLine();
            if (answer == null || answer.isEmpty()) {
                System.out.println("Please type yes or no");
                continue;
            }
            for (char c : answer.toCharArray()) {
                if (Character.isDigit(c)) {
                    throw new customexception("input contains number.");
                }
            }
                 if (answer.equalsIgnoreCase("yes")) {
                    billgenerator();
                    flag=0;
                } else if (answer.equalsIgnoreCase("no")) {
                    displaymenu();
                    flag=0;
                }
        }
    }
}

