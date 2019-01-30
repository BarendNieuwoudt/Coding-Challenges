import java.util.ArrayList;

public class ducci_sequence {

	public int calculate(int[] startingSequence) {
		ArrayList<String> previousSequences = new ArrayList<String>();
		String temp = "";
		for (int i = 0; i < startingSequence.length; i++)
			temp = temp + startingSequence[i] + ",";
		System.out.println(temp);
		while (true) {
			previousSequences.add(temp);
			int[] newlyCalculatedSequence = new int[startingSequence.length];
			for (int i = 0; i < newlyCalculatedSequence.length; i++) {
				if (i == newlyCalculatedSequence.length - 1)
					newlyCalculatedSequence[i] = startingSequence[i] - startingSequence[0];
				else
					newlyCalculatedSequence[i] = startingSequence[i] - startingSequence[i + 1];
				if (newlyCalculatedSequence[i] < 0)
					newlyCalculatedSequence[i] = newlyCalculatedSequence[i] * -1;
			}
			temp = "";
			for (int i = 0; i < newlyCalculatedSequence.length; i++)
				temp = temp + newlyCalculatedSequence[i] + ",";
			startingSequence = newlyCalculatedSequence;
			if (previousSequences.contains(temp))
				break;
			System.out.println(temp);
		}
		return previousSequences.size();
	}

}
