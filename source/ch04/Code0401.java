public class Code0401{
    public static void main(String[] args) {
        int i =2;
        int sum = 0;
        // calculate sum from 1 to 10
        while ( i <= 100 ){
             // sum = sum + i;
             if ( i % 2 == 0 )
                sum += i;
             i++;
         }
        System.out.println("sum even number of 1 to 100 = " + sum);
        //sum = 2+4+6+8+10 +12  .... + 98 +100;
    }
}
