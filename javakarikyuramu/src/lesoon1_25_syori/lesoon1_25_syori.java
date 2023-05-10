package lesoon1_25_syori;

public class lesoon1_25_syori {
	
	private String name;
	private int HP;
	private int MP;
	private int 攻撃力;
	private int 素早さ;
	private int 防御力;
	
	public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}
		
		public void status(String name) {
			System.out.println("こんにちは 「" + this.name + "」 さん");
			System.out.println("ステータス");
		}
		
		public class lesoon1_25_setter extends lesoon1_25_syori{

			public void status(String name){
				super.setName(name);
				
				System.out.println("HP:" + HP);
				System.out.println("MP:" + MP);
				System.out.println("攻撃力:" + 攻撃力);
				System.out.println("素早さ:" + 素早さ);
				System.out.println("防御力:" + 防御力);
				System.out.println();
				System.out.println("さあ冒険に出かけよう！");
		}
		} 
	}