package utils;

public class Math {

	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		else 
			return n*factorial(n-1);
	}
	public static int factorialLoop(int n){
		int end=1;
		for(int i=1;i<=n;i++){
			end=end*i;
		}
		
		return end;
	}
	
}
