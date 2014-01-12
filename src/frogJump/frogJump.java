package frogJump;
import java.math.*;
public class frogJump {

	/**
	 * @param args
	 */
	public static  int solution (int X, int Y, int D){
		 // write your code in Java SE 6
        double distance = Y - X;
        double jumps = distance / D;
        return (int) Math.ceil(jumps);
		

		
		
	}

}
