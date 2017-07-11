package task.game_russian_roulette;

public class Revolver {
	public void run(Player A, Player B){
		int killPoint = deadBullet();
		System.out.println("子弹在第"+killPoint+"弹位(范围:0~5)");
		for(int i=0; i<=killPoint; i++){
			if(i%2==0){
				System.out.print(A.name);
			}
			else{
				System.out.print(B.name);
			}
			System.out.println(" shot");
		}
		if(killPoint%2==0){
			System.out.println(A.name+" is dead,and "+B.name+" is the winner!");
		}
		else{
			System.out.println(B.name+" is dead,and "+A.name+" is the winner!");
		}
	}
	public int deadBullet(){
		return (int)(Math.random()*6);
	}
}
