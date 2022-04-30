
public class Main
{
	public static void main(String[] args) {
	    int numberOfDays=1;
	    while(numberOfDays<=12){
	        System.out.print("On the " + numberOfDays);
	        switch(numberOfDays){
	            case(1):
	                System.out.print("st ");
	                break;
	            case(2):
	                System.out.print("nd ");
	                break;
	            case(3):
	                System.out.print("rd ");
	                break;
	            default:
	                System.out.print("th ");
	                
	        }
	        System.out.print("day of Christmas my true love gave to me:");
	        switch(numberOfDays){
	            
	       
	            case(12):
	                System.out.print(" twelve Drummers Drumming, ");
	            case(11):
	                System.out.print(" eleven Pipers Piping, ");
	            case(10):
	                System.out.print(" ten Lords-a-Leaping, ");
	            case(9):
	                System.out.print(" eight Maids-a-Milking, ");
	            case(8):
	                System.out.print(" eight Maids-a-Milking, ");
	            case(7):
	                System.out.print(" seven Swans-a-Swimming, ");
	            case(6):
	                System.out.print(" six Geese-a-Laying, ");
	            case(5):
	                System.out.print(" five Gold Rings, ");
	            case(4):
	                 System.out.print(" four Calling Birds, ");
	            case(3):
	                System.out.print(" three French Hens, ");
	            case(2):
	                System.out.print(" two Turtle Doves, and ");
	            case(1):
	                System.out.print(" a Partridge in a Pear Tree.");
	                
	                
	            
	        }
	        numberOfDays++;
	        System.out.println();
	    }
	}
}