package lesoon1_25_syori;

import java.util.Objects;

public class lesoon1_25_syori {

//	フィールドを作成。
	private String name;
	private int HP;
	private int MP;
	private int attack;
	private int agility;
	private int defense;

//	getterに送り出す
	public int getHP() {
		return HP;
	}

//	フィールドに値を代入(setter)
	public void setHP(int HP) {
		//  nullチェック
		if(Objects.isNull(HP)){
			System.out.println("HP == null");
			return;
		}
		this.HP = HP;
	}

//	getterに送り出す
	public int getMP() {
		return MP;
	}

//	フィールドに値を代入(setter)
	public void setMP(int MP) {
		//  nullチェック
		if(Objects.isNull(MP)){
			System.out.println("MP == null");
			return;
		}
		this.MP = MP;
	}

//	getterに送り出す
	public int getAttack() {
		return attack;
	}

//	フィールドに値を代入(setter)
	public void setAttack(int Attack) {
		//  nullチェック
		if(Objects.isNull(Attack)){
			System.out.println("Attack == null");
			return;
		}
		this.attack = Attack;
	}

//	getterに送り出す
	public int getAgility() {
		return agility;
	}

//  フィールドに値を代入(setter)
	public void setAgility(int Agility) {
		//  nullチェック
		if(Objects.isNull(Agility)){
			System.out.println("Agility == null");
			return;
		}
		this.agility = Agility;
	}

//	getterに送り出す
	public int getDefense() {
		return defense;
	}

//	フィールドに値を代入(setter)。
	public void setDefense(int Defense) {
		//  nullチェック
		if(Objects.isNull(Defense)){
			System.out.println("Defense == null");
			return;
		}
		this.defense = Defense;
	}

//	nameを呼び出しコンソール。	
	public void Status(String name) {
		this.name = name;
		System.out.println("こんにちは 「" + name  + "」 さん");
		System.out.println("ステータス");
	}
}