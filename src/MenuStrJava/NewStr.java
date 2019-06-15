package MenuStrJava;

import java.util.regex.*;

public class NewStr {
	String nstr;
	
	public NewStr(String nstr){
		this.nstr=nstr;
	}
	
	public NewStr(){
		this.nstr="По умолчанию";
	}
	
	public String NewStrOut() {
		return nstr;
	}
	
	public void NewStrIn(String s) {
		this.nstr=s;
	}
		
	public String EqNewStr(String s){
		String answer;
		if(this.nstr.equals(s))
			answer = "  Строки равны!";
	    else
	    	answer = "  Строки не равны!";
	    return answer;
	}
	
	public void DelNewStr(){
		this.nstr = "";	
	}
	public String GetNumbNewStr(){
		String NumbString="";
		this.nstr = this.nstr.replaceAll(" ", ". ");
		this.nstr = this.nstr.replaceAll("[a-z]", "aa");
		this.nstr = this.nstr.replaceAll("[A-Z]", "aa");
		Pattern pattern = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
		Matcher matcher = pattern.matcher(this.nstr);
		int i = 0;
		while (matcher.find(i)) {
			String value = this.nstr.substring(matcher.start(), matcher.end());
		    double doubleResult = Double.parseDouble(value);
		    int intResult = (int) doubleResult;
	    	double k = doubleResult - intResult;
		    if (k==0)
		    	NumbString = NumbString + Integer.toString(intResult) + "   ";
		    else	
		    	NumbString = NumbString + Double.toString(doubleResult) + "   ";
		    i = matcher.end();
		}
		return NumbString;
	}
}
