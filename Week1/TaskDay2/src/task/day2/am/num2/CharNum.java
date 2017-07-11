package task.day2.am.num2;

public class CharNum {

	public static void main(String[] args) {
		
		/*
		 * String [] strs = {"A","B","C","D","C","E","D"};
		 * 找到重复字符是什么及个数
		 */
		
		String [] strs = {"A","B","C","D","C","E","D"};
		int repeat=0;
		for(int i=1; i<strs.length; i++){
			for(int j=0; j<i; j++){
				if(strs[j] == strs[i]){
					repeat++;
					System.out.println(strs[i]);
					break;
				}
			}
		}
		System.out.println("重复字符个数:"+repeat);
	}

}
