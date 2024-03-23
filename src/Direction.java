import java.util.*;

public class Direction {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree :");
        double degree = scanner.nextDouble();

        if(degree>=0 && degree<30.99 || 330<=degree && degree<=360){
            System.out.println("N");
        }
        else if(31<=degree && degree<=59.99){
            System.out.println("NE");
        }
        else if(60<=degree && degree<=90.99 || 91<=degree && degree<=120.99){
            System.out.println("E");
        }
        else if(121<=degree && degree<=150.99){
            System.out.println("SE");
        }
        else if(151<=degree && degree<=180.99 || 181<=degree && degree<=210.99){
            System.out.println("S");
        }
        else if(211<=degree && degree<=240.99){
            System.out.println("SW");
        }
        else if(241<=degree && degree<=270.99 || 271<= degree && degree<=300.99){
            System.out.println("W");
        }
        else if(301<=degree && degree<=329.99){
            System.out.println("NW");
        }
        else
            System.out.println("Invalid");




    }


}