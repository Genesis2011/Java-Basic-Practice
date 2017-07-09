package task.day1.number4;

public class Strengthen {

	public static void main(String[] args) {
		
		/*
		 * k%机率成功		N+=1
		 * (1-k%)机率失败
		 * 		如果N不是零	N-=1
		 * 		否则		N＝0
		 */
		
		int N=2;
		// luck表示随机的机率k
		int luck=(int)(Math.random()*100)+1;
		
		int standard=50;
		if(luck>=standard){
			N+=1;
		}
		else if(N!=0){
			N-=1;
		}
		else{
			N=0;
		}
		
		System.out.println("N："+N);
	}

}
