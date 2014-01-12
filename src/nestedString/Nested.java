package nestedString;

public class Nested {
	  public static int solution(String S) {
	        // write your code in Java SE 6
		 
		 
		 int SLength = S.length();
		 char [] queue= new char[SLength];
		 int push=-1;
		 for (int i = 0; i < SLength;i++){
			 if (S.charAt(i) == '(' || S.charAt(i) == '{' || S.charAt(i) == '['){
				 //push
				 push=push+1;
				 queue[push]=S.charAt(i);
				 
			 }else {
				 //pop
				 if(push==-1){
					 //no elements in queue to match
					 return 0;}
				 if( (queue[push] == '(' && S.charAt(i)==')') || 
				     (queue[push] == '{' && S.charAt(i)=='}') ||
				     (queue[push] == '[' && S.charAt(i)==']')){
					 push=push-1;
				 }else{return 0;}
			 }
			 }
		 
		 
			 return 1;
	    }

}
