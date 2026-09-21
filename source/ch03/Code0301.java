public class Code0301 {
    public static void main(String[] args) {
        boolean isLightOn = false;
        int currentHour  = 11;

        //if ( isLightOn)
        if ( isLightOn  == true) {
            System.out.println("Light is On. 1..!!");
            System.out.println("Light is On. 2..!!");
        }

        if ( currentHour < 12 )
            System.out.println("current is AM");

        if ( currentHour >= 12 )
            System.out.println("current is PM");
    }
}