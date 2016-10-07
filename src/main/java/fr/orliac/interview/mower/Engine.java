package fr.orliac.interview.mower;

import java.util.LinkedList;
import java.util.List;

public class Engine implements IMachineListener{

	List<IMachine> machines = new LinkedList<>();
	
	public void launch(){
		next();
	}
	
    public void addMower(Mower mower){
    	mower.addListener(this);
    	machines.add(mower);
    }
    
    private void next(){
    	if(!machines.isEmpty()){
    		Mower next = (Mower) machines.remove(0);
    		next.start();
    	}
    }

	@Override
	public void onFinish(IMachine machine) {
		machine.printPosition();
		next();
	}
}
