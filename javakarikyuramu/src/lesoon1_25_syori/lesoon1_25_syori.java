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

	// フィールドのnameを呼び出す。	
	public void Status() {
		System.out.println("こんにちは 「" + this.name + "」 さん");
		System.out.println("ステータス");
	}
}