public class additive_persistance {
	
	public int calculate(int n){
		int c = 0;
		while(n > 9){
			c++;
			String s = n + "";
			n = 0;
			for (int i = 0; i < s.length(); i++)
				n += Integer.parseInt(s.charAt(i) + "");
		}
		return c;
	}
	
	public int calculateRec(int n){
		if(n < 10)
			return 0;
		else {
			String s = n + "";
			n = 0;
			for (int i = 0; i < s.length(); i++)
				n += Integer.parseInt(s.charAt(i) + "");
			return 1 + calculateRec(n);
		}
	}

}
