import java.util.Scanner;

public class OTurn implements Action {
	Context context;

	public OTurn(Context newContext) {
		context = newContext;
		System.out.println("Player O's turn");
		System.out.println("Choose a stone from 0-8");

		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		
		while (true) {
			if (s >= 0 && s <= 8) {
				keyPressed('c');
				break;
			} else
				System.out.println("Please enter something valid");
			break;
		}
	}

	@Override
	public void keyPressed(char c) {
		context.setCurrentState(context.getoTurn());
	}

}
