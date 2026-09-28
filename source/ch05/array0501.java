public class Code0502 {
    public static void main(String[] args) {
        int[] englishScores ={88, 70, 90, 66, 87};
        int total = 0;
        double average = 0;
        int max;
        // calculate total and average
        for (int i=0; i <5 ; i++)
            total += englishScores[i];
        average = total / 5;
        System.out.println("total is " + total +"  Average is " + average);
        // find Max score of enlischScores..
        max = englishScores[0];
        for(int i=1; i < 5; i++){
            if ( max < englishScores[i])
                max = englishScores[i];
        }
        System.out.println("Max score is " + max);
        
    }
}
