public class Context {

	Action splash;
	Action xTurn;
	Action oTurn;
	Action end;
	
	Action currentState;
	
	World world;
	
	public Context() {
		splash = new Splash(this);
		xTurn = new XTurn(this);
		oTurn = new OTurn(this);
		end = new End(this);
		
		currentState = splash;
	}
	
	public void setCurrentState(Action newCurrentState) {
		currentState = newCurrentState;
	}
	
	public void keyPressed(char c) {
		
	}

	
	// --- Getters ---
	public Action getSplash() {
		return splash;
	}

	public Action getxTurn() {
		return xTurn;
	}

	public Action getoTurn() {
		return oTurn;
	}

	public Action getEnd() {
		return end;
	}

	public Action getCurrentState() {
		return currentState;
	}

	public World getWorld() {
		return world;
	}

	// --- Setters ---
	
	public void setSplash(Action splash) {
		this.splash = splash;
	}

	public void setxTurn(Action xTurn) {
		this.xTurn = xTurn;
	}

	public void setoTurn(Action oTurn) {
		this.oTurn = oTurn;
	}

	public void setEnd(Action end) {
		this.end = end;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
	
	
}
