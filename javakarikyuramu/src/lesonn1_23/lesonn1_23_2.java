package lesonn1_23;

import java.util.Objects;

public class lesonn1_23_2 {

	  // フィールド	numberを作成
	private String number;
	
	  // getterに送り出す
	public String getAnimal() {
	    return number;
	}
	
	 // フィールドに値を代入(setter)
	public void setAnimal(String number) {
	    this.number = number;
	    
	  // nullチェック
	    Object obj = null;
	    if(Objects.nonNull(obj)) {
	        System.out.println("obj == null");
	    }
	}

}
