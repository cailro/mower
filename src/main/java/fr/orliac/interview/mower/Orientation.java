package fr.orliac.interview.mower;

public enum Orientation {
	NORTH, 
	EAST, 
	SOUTH, 
	WEST;

	private static Orientation[] vals = values();

	/*
	 * Turn left consist of choosing the next enumeration
	 */
	public Orientation right()
	{
		return vals[(this.ordinal()+1) % vals.length];
	}

	/*
	 * Turn left consist of choosing the previous enumeration
	 */
	public Orientation left()
	{
		int index = (this.ordinal()-1) % vals.length;
		index = index < 0 ? vals.length -1 : index; 
		return vals[index];
	}
}
