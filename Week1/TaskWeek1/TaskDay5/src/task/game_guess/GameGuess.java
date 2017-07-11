package task.game_guess;
import java.util.*;
public class GameGuess {
	public void play(){
		System.out.println("欢迎来到人机猜拳游戏");
		System.out.print("请输入玩家姓名:");
		Scanner input = new Scanner(System.in);
		String name=input.next();
		Player player=new Player();
		player.name=name;
		System.out.println("选择要挑战的人物");
		System.out.println("1:董卓;2:吕布;3:赤兔");
		Computer com=new Computer();
		switch(input.nextInt()){
		case 1:
			com.name="董卓";
			break;
		case 2:
			com.name="吕布";
			break;
		case 3:
			com.name="赤兔";
			break;
		}
		System.out.println(player.name+" VS "+com.name);
		player.score=0;
		com.score=0;
		System.out.println("游戏开始");
		while(true){
			int pNum=player.hit();
			int cNum=com.hit();
			if(pNum==cNum){
				System.out.println("平局");
			}
			else{
				if(pNum==1&&cNum==2 || pNum==2&&cNum==3 || pNum==3&&cNum==1){
					System.out.println(player.name+"赢了一局");
					player.score++;
				}
				else{
					System.out.println(com.name+"赢了一局");
					com.score++;
				}
			}
			System.out.print("是否再玩一局(y/n):");
			String type = input.next();
			if("n".equals(type)){
				break;
			}
		}
		System.out.println("最终结果:");
		if(player.score==com.score)
			System.out.println(player.name+"和"+com.name+"打成平手");
		else if(player.score>com.score)
			System.out.println(player.name+"赢了");
		else
			System.out.println(player.name+"输了");
	}
}
