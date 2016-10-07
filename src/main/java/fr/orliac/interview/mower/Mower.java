package fr.orliac.interview.mower;

import java.util.ArrayList;
import java.util.List;

public class Mower implements IMachine
{
	private Coords coords;
	private Coords bounds;
	private Orientation orientation;
	
	private List<Action> commands;
	private List<IMachineListener> listeners;

	public Mower(Coords coords, Orientation orientation, Coords bounds) {
		this.coords = coords;
		this.orientation = orientation;
		this.bounds = bounds;
		
		listeners = new ArrayList<>();
		commands = new ArrayList<>();
	}
	
	public void setCommands(List<Action> commands) {
		this.commands = commands;
	}
	
	public void start(){
		
		for(Action action : commands){
			execute(action);
		}
		notifyOnFinishEvent();
	}
	
	private void execute(Action action) {
		switch (action) {
		case LEFT:
			turnLeft();
			break;
		case RIGHT:
			turnRight();
			break;
		case MOVE:
			goFoward();
			break;
		}
	}

	@Override
	public void printPosition(){
		System.out.println(coords.toString() + " " + orientation.toString());
	}

	@Override
	public void turnLeft() {
		orientation = orientation.left();
	}

	@Override
	public void turnRight() {
		orientation = orientation.right();
	}

	@Override
	public void goFoward() {
		switch (orientation) {

		case NORTH:
			if(coords.getY() < bounds.getY()) coords.incY();
			break;
		case EAST:
			if(coords.getX() < bounds.getX()) coords.incX();
			break;
		case SOUTH:
			if(coords.getY() > 0) coords.decY();
			break;
		case WEST:
			if(coords.getX() > 0) coords.decX();
			break;
		}
	}
	
	public Coords getCoords() {
		return coords;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	public void addListener(IMachineListener l){
		listeners.add(l);
	}
	
	private void notifyOnFinishEvent(){
		
		for(IMachineListener listener : listeners){
			listener.onFinish(this);
		}
	}
}
