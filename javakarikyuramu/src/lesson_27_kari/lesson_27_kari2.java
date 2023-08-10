package lesson_27_kari;

public class lesson_27_kari2 {
	
	// フィールドを作成。
	private String name;
	private String scientificName;

	// getterに送り出す。
	public String getName() {
		return name;
	}

	// フィールドに値を代入(setter)
	public void setName(String name) {
		this.name = name;

    // 送られたnameをthis.scientificNameに割り当てる。
		this.scientificName = getScientificName(name);
	}

	// getterに送り出す。
	public String getScientificName() {
		return scientificName;
	}

	// 送られたnameを選別する。
	private String getScientificName(String animalName) {

	// swith文を使い条件分岐をする。
		switch (animalName) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		case "インコ":
			return "不明";
		default:
			return "学名が見つかりません";
		}
	}
}
