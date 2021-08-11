import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Irina","SaGhoiAn");
		logininfo.put("Monica","oneTWOtree");
		logininfo.put("Santa","Claus000Hoho");
		logininfo.put("Johnny","pirate8Depp");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}

}
