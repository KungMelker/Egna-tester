package printingBase6;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dice d6 = new Dice();

		d6.diceDSix(1295);

	}

	public void diceDSix(int turns) {

		int[] counter = new int[4];
		int diceMax = 6;

		for (int i = 0; i < counter.length; i++) {

			counter[i] += 1;
		}

		for (int j = 0; j <= turns; j++) {

			printCounter(counter, j);
			counter[0] += 1;

			if (counter[0] == diceMax + 1) {

				counter[1] += 1;
				counter[0] = 1;

				if (counter[1] == diceMax + 1) {

					counter[2] += 1;
					counter[1] = 1;

					if (counter[2] == diceMax + 1) {

						counter[3] += 1;
						counter[2] = 1;

						if (counter[3] == diceMax + 1) {

							break;

						}
					}
				}
			}
		}
	}

	public void printCounter(int[] counter, int j) {

		String result = "j = " + j + " Counter: " + counter[3] + counter[2] + counter[1] + counter[0];
		System.out.println(result);

	}

}