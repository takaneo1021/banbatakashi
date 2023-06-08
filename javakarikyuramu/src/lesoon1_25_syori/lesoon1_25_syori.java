package lesoon1_25_syori;

import java.util.Objects;

public class lesoon1_25_syori {

	// フィールドを作成。
	private String name;
	private int HP;
	private int MP;
	private int attack;
	private int agility;
	private int defense;

	// getterに送り出す
	public String getName(String name) {
		return name;
	}

	// フィールドに値を代入(setter)
	public void setName(String name) {

		// nullチェック
		if(Objects.isNull(name)) {
			System.out.println("name == null");
			return;
		} 
		this.name = name;
	}

	// getterに送り出す
	public int getHP(int HP) {
		return HP;
	}

	// フィールドに値を代入(setter)
	public void setHP(int HP) {

		// nullチェック
		if(Objects.isNull(HP)) {
			System.out.println("HP == null");
			return;
		} 
		this.HP = HP;
	}

	// getterに送り出す
	public int getMP(int MP) {
		return MP;
	}

	// フィールドに値を代入(setter)
	public void setMP(int MP) {

		// nullチェック
		if(Objects.isNull(MP)) {
			System.out.println("MP == null");
			return;
		} 
		this.MP = MP;
	}
	
	// getterに送り出す
	public int getAttack(int attack) {
		return attack;
	}

	// フィールドに値を代入(setter)
	public void setAttack(int attack) {

		// nullチェック
		if(Objects.isNull(attack)) {
			System.out.println("attack == null");
			return;
		} 
		this.attack = attack;
	}

	// getterに送り出す
	public int getAgility(int agility) {
		return agility;
	}

	// フィールドに値を代入(setter)
	public void setAgility(int agility) {

		// nullチェック
		if(Objects.isNull(agility)) {
			System.out.println("agility == null");
			return;
		} 
		this.agility = agility;
	}

	// getterに送り出す
	public int getDefense(int defense) {
		return defense;
	}

	// フィールドに値を代入(setter)
	public void setDefense(int defense) {

		// nullチェック
		if(Objects.isNull(defense)) {
			System.out.println("defense == null");
			return;
		} 
		this.defense = defense;
	}

	// フィールドを呼び出す。	
	public String toString() {
		return "こんにちは 「" + this.name + "」 さん" +
				"\nステータス" +
				"\nHP:" + this.HP + 
				"\nMP:" + this.MP + 
				"\n攻撃力::" + this.attack + 
				"\n素早さ:" + this.agility + 
				"\n防御力:" + this.defense ;
	}
}