package missingValue;

import java.util.Arrays;

public class missingValue {
	
    public static int solution(int[] A) {
    	 if(A.length== 0) {return 1;}
      	Arrays.sort(A);
      	for(int i=0;i<A.length;i++){
      		if(i+1 != A[i]){
      			return i+1;
      		}
      	}
      	//The missing element must be the last one
      	return A.length+1;
    }
}
