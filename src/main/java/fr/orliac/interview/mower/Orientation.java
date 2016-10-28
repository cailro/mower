package fr.orliac.interview.mower;

public enum Orientation {
	NORTH, 
	EAST, 
	SOUTH, 
	WEST;

	private static Orientation[] vals = values();

	public Orientation right()
	{
		return vals[(this.ordinal()+1) % vals.length];
	}
	
	public Orientation left()
	{
		int index = (this.ordinal()-1) % vals.length;
		index = index < 0 ? vals.length -1 : index; 
		return vals[index];
	}
}
