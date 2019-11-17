import java.io.IOException;
import java.io.*;

public abstract class function implements MinOrder {
    int num;
    int bill=0;
    boolean found=false;


    @Override
    public boolean minorder() {
        if (bill < 200)
            return true;
        else
            return false;
    }

    public void billgenerator(){
        if(minorder()){
            System.out.println("Sorry , your order is below the minimum value. Please restart and order more items.");

        }
        else{
            System.out.println("Your bill is Rs." + bill);
            System.out.println("Thank you for ordering." );
        }
    }


    public void displaymenu() throws IOException {

    }

 public void write(String s) throws IOException{
     File file = new File("bill.txt");
     FileWriter fw = new FileWriter(file, true);
     fw.write(s+"\n");
     fw.close();

 }

}