public class Arrays {

    public static void main(String[] args) {


        String [] names = {"Ibukun","Onyi", "Akokites"};

        System.out.println("Implementing for loop");
        for (int i=0; i < names.length; i++){
            System.out.println( "Name at Index " + i + " is " + names[i]);
        }

        System.out.println();
        System.out.println("Implementing while loop");

        int counter = 0;
         while (counter < names.length){
             System.out.println( "Name at Index " + counter + " is "  + names[counter]);
             counter++;
         }


         int [][] grades = new int [3][4];

         int [][] scores = {
                 {70, 89, 98, 93},
                 {57, 49, 82, 90},
                 {75, 34, 99, 45}
         };

         scores[0][1] = 95;

         for (int row = 0; row < scores.length; row ++) {
             System.out.println("processing row " + row);
             for (int col = 0; col < scores[row].length; col++) {
                 System.out.print(scores[row][col]);
                 System.out.print(" ");
             }

             System.out.println();
         }

        System.out.println("iterating with the enhanced for loop..");
         for(int[] row : scores){
             System.out.println("Processing a row");
             for(int col : row){
                 System.out.print(col);
                 System.out.print(" ");
             }
             System.out.println();
         }



         float total = 0;
         float [] c = new float[100];
         for(int i = 0; i < c.length; i++){
             c[i]= i;
             total += c[i];
         }
        System.out.print("Total is " + total);
    }



}
