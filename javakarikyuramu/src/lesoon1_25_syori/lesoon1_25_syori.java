package lesoon1_25_syori;

public class int {
	
	private String name;
	private int HP;
	private int MP;
	private int attack;
	private int agility;
	private int defense;
	
	public String getName() {
		return name;
		}

	public void setName(String name) {
		this.name = name;
		}
	
	public int getHP() {
		return HP;
		}

	public void setHP(int HP) {
		this.HP = HP;
		}
	
	public int getMP() {
		return MP;
		}

	public void setMP(int MP) {
		this.MP = MP;
		}
	
	public int getAttack() {
		return attack;
		}

	public void setAttack(int Attack) {
		this.attack = Attack;
		}
	
	public int getAgility() {
		return agility;
		}

	public void setAgility(int Agility) {
		this.agility = Agility;
		}
	
	public int getDefense() {
		return defense;
		}

	public void setDefense(int Defense) {
		this.defense = Defense;
		}
		
		
		public void status(String name) {
			System.out.println("こんにちは 「" + name + "」 さん");
			System.out.println("ステータス");
		}
		
		public class status extends lesoon1_25_syori{

			public void status(String name){
				super.status(this.name);
				
		}
		} 
	}