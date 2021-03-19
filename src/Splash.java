import java.util.Scanner;

public class Splash implements Action {
	Context context;

	public Splash(Context newContext) {
		context = newContext;
		System.out.println("--- Tic Tac Toe ---");
		System.out.println("Type something to start");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		keyPressed('c');
	}

	@Override
	public void keyPressed(char c) {
		context.setCurrentState(context.getxTurn());
	}

}
