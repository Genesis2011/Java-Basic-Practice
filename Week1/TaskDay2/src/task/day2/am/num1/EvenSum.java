package task.day2.am.num1;

public class EvenSum {

	public static void main(String[] args) {
		
		/*
		 * 1~100之间偶数和
		 */
		
		int sum=0;
		for(int i=1; i<=100; i++){
			if(i%2==0)
				sum+=i;
		}
		System.out.println("1~100之间偶数和:"+sum);

	}

}
