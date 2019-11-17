import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class service {

    public static void main(String args[]) throws IOException {
        Scanner ss = new Scanner(System.in);
        System.out.println(" Welcome to our online food delivery system. Please select the type of food which you want to order.");
        System.out.println("");
        System.out.println("1.Indian");
        System.out.println("2.Italian");
        System.out.println("3.Chinese ");
        System.out.println("");
        int num = ss.nextInt();
        ss.nextLine();

        switch (num) {
            case 1: {

                Indian ind = new Indian();
                try {
                    ind.displaymenu();
                }catch(Exception e){}

                try
                {
                    ind.confirm();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;

            }

            case 2:{
                Italian ita = new Italian();
                try {
                    ita.displaymenu();
                }catch(Exception e){}

                try
                {
                    ita.confirm();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            }

            case 3:{
                Chinese chi = new Chinese();
                try {
                    chi.displaymenu();
                }catch(Exception e){}

                try
                {
                    chi.confirm();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            }

        }
    }
}
