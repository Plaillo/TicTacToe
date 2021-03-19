
public class End implements Action {
	Context context;

	public End(Context newContext) {
		context = newContext;
	}

	@Override
	public void keyPressed(char c) {
		context.setCurrentState(context.getSplash());

	}

}
