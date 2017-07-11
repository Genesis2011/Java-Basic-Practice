package task.day1.number3;

import java.util.Scanner;

public class StarDegree {
	
	/*
	 * 输入攻击力
	 * 根据攻击力的值，判断星级
	 * 0～1000		⭐
	 * 1000～2500	⭐⭐
	 * 2500～5000	⭐⭐⭐
	 * 5000～10000	⭐⭐⭐⭐
	 * 10000～		⭐⭐⭐⭐⭐
	 */
	
	public static int attack;
	
	public static void main(String[] args) {
		System.out.print("请输入攻击力：");
		
		// 键盘输入数据可能引起异常
		try {
			Scanner input = new Scanner(System.in);
			attack = input.nextInt();
			
			//输入数据为负数，抛出异常
			if(attack<0){
				throw new Exception("负数！");
			}
			
			//星级
			int starNum;
			if(0<=attack && attack<1000){
				starNum=1;
			}
			else if(attack<2500){
				starNum=2;
			}
			else if(attack<5000){
				starNum=3;
			}
			else if(attack<10000){
				starNum=4;
			}
			else{
				starNum=5;
			}
			
			for(int i=0; i<starNum; i++)
				System.out.print("⭐️");
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("你的输入格式有误！");
			System.out.println("异常："+e);
		}
		
	}

}
