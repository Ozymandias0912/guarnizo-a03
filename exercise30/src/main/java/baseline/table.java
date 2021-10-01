package baseline;

public class table {

    //class table

 private int rows;
 private int columns;
 private int[][] doubleArray;




    public table(int r, int c){
        if(r >= 0){
            this.rows = r;
        }
         else{
            System.out.println("row input invalid");
         }

        if(c >= 0){
            this.columns = c;
        }
        else{
            System.out.println("columns input invalid");
        }

        this.doubleArray = new int[rows][columns];


    }//end constructor

    public void fillMultiplicationRow(int[] data, int row){
        for(int i = 0; i < columns; i++){

            this.doubleArray[row][i] = (row + 1) * (i + 1);

        }

    }

    public void printTable(int rows, int columns, int[][]table){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("%-5d", table[i][j]);

            }
            System.out.println("\n");
        }

    }//end print method

    public int[][] getDoubleArray(){
        return this.doubleArray;
    }
}//end class
