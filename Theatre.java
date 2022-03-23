package ca.humber.lab06;

/**
 *
 * @author Anthony Elia - N01515607
 */
public class Theatre {
    private String[][] theatre;
    
    public Theatre() {
        theatre = new String[11][21];
        initializeTheatre();
    }
    
    public void initializeTheatre() {
        for (int row = 0; row < 11; row++){
            for (int col = 0; col < 21; col++)
                theatre[row][col] = "- ";  
        }
     seatCoordinates();
    }
    
    public void seatCoordinates(){
       theatre[0][0] = " ";
      //column coordinates      
       theatre[0][1] = "1 ";
       theatre[0][2] = "2 ";
       theatre[0][3] = "3 ";
       theatre[0][4] = "4 ";
       theatre[0][5] = "5 ";
       theatre[0][6] = "6 ";
       theatre[0][7] = "7 ";
       theatre[0][8] = "8 ";
       theatre[0][9] = "9 ";
       theatre[0][10] = "10";
       theatre[0][11] = "11";
       theatre[0][12] = "12";
       theatre[0][13] = "13";
       theatre[0][14] = "14";
       theatre[0][15] = "15";
       theatre[0][16] = "16";
       theatre[0][17] = "17";
       theatre[0][18] = "18";
       theatre[0][19] = "19";
       theatre[0][20] = "20";
      //row coordinates
       theatre[1][0] = "A";
       theatre[2][0] = "B";
       theatre[3][0] = "C";
       theatre[4][0] = "D";
       theatre[5][0] = "E";
       theatre[6][0] = "F";
       theatre[7][0] = "G";
       theatre[8][0] = "H";
       theatre[9][0] = "I";
       theatre[10][0] = "J";
    }   
    
    public void printMap() {
        System.out.println();
        for (int row = 0; row < 11; row++) {
            for (int col = 0; col < 21; col++)  
                System.out.print(theatre[row][col] + "  ");
            System.out.println();
        }
    }
    
    public void setSeat(int row, int col) {
        theatre[row][col] = "XX";
    }
    
    public boolean isSeatEmpty(int row, int col) {
       if (col < 21){ 
        if (theatre[row][col].equals("- ") ){
            return true;
        }else {
            System.out.println("Appologies, but that seat is invalid.");
         return false;
        }
       }else {
           System.out.println("Appologies, but that seat is invalid.");
           return false;
       }
    }
    
}
