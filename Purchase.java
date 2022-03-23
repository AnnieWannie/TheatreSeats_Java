package ca.humber.lab06;
import java.util.Scanner;
/**
 *
 * @author Anthony Elia - N01515607
 */
public class Purchase {
    private Theatre theatreMap;
    private Scanner scanner;
    
    public Purchase() {
        theatreMap = new Theatre();
        theatreMap.printMap();
        scanner = new Scanner(System.in);
        userPurchase();
    }
    
    public void userPurchase() {       
        for (int i = 1; i < 201; i++){
           makePurchase();
           if (i == 200) {
                System.out.println("Sorry, seats are all sold out!");
            }
        }      
    }
    
    public int rowConverter(){
        int row = 0;
        String columnValue = scanner.next();
        
        switch (columnValue.toUpperCase()){ 
            case "A":
             row = 1;
             break;
            case "B":
             row = 2;
             break;
            case "C":
             row = 3;
             break; 
            case "D":
             row = 4;
             break;
            case "E":
             row = 5;
             break; 
            case "F":
             row = 6;
             break; 
            case "G":
             row = 7;
             break; 
            case "H":
             row = 8;
             break;
            case "I":
             row = 9;
             break;
            case "J":
             row = 10;
             break;
             
    }
        return row;
    }
    
    
    public void makePurchase() {
            System.out.print("\nUsing coordinates *ex. A 14*\nplease enter the seat you would like to purchase: ");
            int userRow = rowConverter();
            int userCol = scanner.nextInt();
                        
            if (theatreMap.isSeatEmpty(userRow, userCol)) {
                theatreMap.setSeat(userRow, userCol);
                theatreMap.printMap();
            } 
    }
}
