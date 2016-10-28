package fr.orliac.interview.mower;

public class Coordinate {

	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;

        Coordinate o = (Coordinate)obj;
        return (o.x == x && o.y == y);
    }
}
