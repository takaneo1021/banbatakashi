package lesoon1_25_syori;

import java.util.Random;

    // lesoon1_25_syoriを継承
public class lesoon1_25_sabu extends lesoon1_25_syori {

	// ランダムの値を作成、代入
	    Random rand = new Random();
	    int HP = rand.nextInt(999)+1;
	    int MP = rand.nextInt(999)+1;
	    int Attack = rand.nextInt(999)+1;
	    int Agility = rand.nextInt(999)+1;
	    int Defense = rand.nextInt(999)+1;

	// コントラクトを呼び出しnemeに“名前”をあてる。
	public void StatusSab() {
		
    // lesoon1_25_syoriのStatus()を取ってくる。	
		super.Status();
	
		System.out.println("HP:" +HP);
		System.out.println("MP:" + MP);
		System.out.println("攻撃力:" + Attack);
		System.out.println("素早さ:" + Agility);
		System.out.println("防御力:" + Defense);
		System.out.println("\r\nさあ冒険に出かけよう！");
	}
}