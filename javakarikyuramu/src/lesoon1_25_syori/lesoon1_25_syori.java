package lesoon1_25_syori;

import java.util.Random;

public class lesoon1_25_syori {
	
	private String 名前;
	private int HP;
	private int MP;
	private int 攻撃力;
	private int 素早さ;
	private int 防御力;
	
	public lesoon1_25_syori() {
		Random rand = new Random();
		HP = rand.nextInt();
		MP = rand.nextInt();
		攻撃力 = rand.nextInt();
		素早さ = rand.nextInt();
		防御力 = rand.nextInt();
		}
	
	public String get名前() {
		return 名前;
		}

		public void set名前(String 名前) {
		this.名前 = 名前;
		}
		
		@Override
		public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("こんにちは 「");
		sb.append(get名前());
		sb.append(" 」 さん");
		sb.append("ステータス");
		sb.append(System.lineSeparator());
		sb.append("HP：");
		sb.append(HP);
		sb.append(System.lineSeparator());
		sb.append("MP：");
		sb.append(MP);
		sb.append(System.lineSeparator());
		sb.append("攻撃力：");
		sb.append(攻撃力);
		sb.append(System.lineSeparator());
		sb.append("素早さ：");
		sb.append(素早さ);
		sb.append(System.lineSeparator());
		sb.append("防御力：");
		sb.append(防御力);
		sb.append(System.lineSeparator());
		sb.append(System.lineSeparator());
		sb.append("さあ冒険に出かけよう！");
		return sb.toString();
		}

}
