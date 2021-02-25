public class SalesCommission {

    private static final int basePay = 200;

    public static void getSalesCommissionDistribution(int [] sales, int [] frequency){
        for(int sale : sales){
            int commission = (int) (sale * 0.09);
            int pay = basePay + commission;
            pay = pay/ 100;

            switch (pay){
                case 2:
                    ++frequency[0];
                     break;

                case 3:
                    ++frequency[1];
                    break;
                case 4:
                    ++frequency[2];
                    break;
                case 5:
                    ++frequency[3];
                    break;
                case 6:
                    ++frequency[4];
                    break;
                case 7:
                    ++frequency[5];
                    break;
                case 8:
                    ++frequency[6];
                    break;
                case 9:
                    ++frequency[7];
                    break;
                default: ++frequency[8];

                }
            }
        }




    public static void getSalesCommissionDistribution(int sales, int [] frequency){

            int commission = (int) (sales * 0.09);
            int pay = basePay + commission;
            pay = pay/ 100;

            switch (pay){
                case 2:
                    ++frequency[0];
                    System.out.printf("The sales at  $200–299 is %d%n",frequency[0]);
                    break;

                case 3:
                    ++frequency[1];
                    System.out.printf("The sales at  $300–399 is %d%n",frequency[1]);
                    break;
                case 4:
                    ++frequency[2];
                    System.out.printf("The sales at  $400–499is %d%n",frequency[2]);
                    break;
                case 5:
                    ++frequency[3];
                    System.out.printf("The sales at  $500–599 is %d%n",frequency[3]);
                    break;
                case 6:
                    ++frequency[4];
                    System.out.printf("The sales at  $600–699 is %d%n",frequency[4]);
                    break;
                case 7:
                    ++frequency[5];
                    System.out.printf("The sales at $700–799 is %d%n",frequency[5]);
                    break;
                case 8:
                    ++frequency[6];
                    System.out.printf("The sales at  $800–899 is %d%n",frequency[6]);
                    break;
                case 9:
                    ++frequency[7];
                    System.out.printf("The sales at $900–999 is %d%n",frequency[7]);
                    break;
                default: ++frequency[8];
                    System.out.printf("The sales at  $1,000 and over is %d%n",frequency[8]);
        }




    }


}



