package fr.orliac.interview.mower;

public class Coords {

	private int x;
	private int y;
	
	public Coords(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/*
	 * On avance la tondeuse d'une case dans la direction EAST
	 */
	public void incX(){
		x = x + 1;
	}
	
	/*
	 * On avance la tondeuse d'une case dans la direction NORTH
	 */
	public void incY(){
		y = y + 1; 
	}
	
	/*
	 * On avance la tondeuse d'une case dans la direction WEST
	 */
	public void decX(){
		x = x - 1;
	}
	
	/*
	 * On avance la tondeuse d'une case dans la direction SOUTH
	 */
	public void decY(){
		y = y - 1; 
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}
}
