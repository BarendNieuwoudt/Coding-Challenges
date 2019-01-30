import java.util.ArrayList;

public class perfectly_balanced {

	// Given a string containing only the characters x and y, find whether there
	// are the same number of x's and y's.
	public boolean balanced(String s) {
		int x = 0, y = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'x')
				x++;
			else if (s.charAt(i) == 'y')
				y++;
		if (x == y)
			return true;
		else
			return false;
	}

	// Given a string containing only lowercase letters, find whether every
	// letter that appears in the string appears the same number of times.
	public boolean balancedBonus(String s) {
		if (s == "")
			return true;
		else {
			ArrayList<Character> letters = new ArrayList<Character>();
			ArrayList<Integer> amount = new ArrayList<Integer>();
			letters.add(0, s.charAt(0));
			amount.add(0, 1);
			for (int i = 1; i < s.length(); i++)
				if(letters.contains(s.charAt(i))){
					amount.set(letters.indexOf(s.charAt(i)), amount.get(letters.indexOf(s.charAt(i))) + 1);
				}else{
					letters.add(s.charAt(i));
					amount.add(1);
				}
			for (int i = 0; i < letters.size(); i++)
				if(amount.get(i) != amount.get(0))
					return false;
			return true;
		}
	}

}
