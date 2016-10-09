package fr.orliac.interview.mower.app;

import fr.orliac.interview.mower.Action;
import fr.orliac.interview.mower.Coordinate;
import fr.orliac.interview.mower.Orientation;

import java.util.ArrayList;
import java.util.List;


class Mower implements IMachine
{
	private Coordinate Coordinate, bounds;
	private Orientation orientation;
	
	private List<Action> commands;
	private List<IMachineListener> listeners;

	Mower(Coordinate Coordinate, Orientation orientation, Coordinate bounds) {
		this.Coordinate = Coordinate;
		this.orientation = orientation;
		this.bounds = bounds;
		
		listeners = new ArrayList<>();
		commands = new ArrayList<>();
	}
	
	void setCommands(List<Action> commands) {
		this.commands = commands;
	}

	void start(){
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
			moveForward();
			break;
		}
	}

	@Override
	public void printPosition(){
		System.out.println(Coordinate.toString() + " " + orientation.toString());
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
	public void moveForward() {
		switch (orientation) {

		case NORTH:
			if(Coordinate.getY() < bounds.getY()) Coordinate.incY();
			break;
		case EAST:
			if(Coordinate.getX() < bounds.getX()) Coordinate.incX();
			break;
		case SOUTH:
			if(Coordinate.getY() > 0) Coordinate.decY();
			break;
		case WEST:
			if(Coordinate.getX() > 0) Coordinate.decX();
			break;
		}
	}
	
	Coordinate getCoordinate() {
		return Coordinate;
	}
	
	Orientation getOrientation() {
		return orientation;
	}
	
	void addListener(IMachineListener l){
		listeners.add(l);
	}
	
	private void notifyOnFinishEvent(){
		
		for(IMachineListener listener : listeners){
			listener.onFinish(this);
		}
	}
}
