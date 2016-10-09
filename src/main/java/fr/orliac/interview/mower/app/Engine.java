package fr.orliac.interview.mower.app;

import java.util.LinkedList;
import java.util.List;

/**
 *  La classe Engine est chargée d'instancier les tondeuses et de candencer leur lancement.
 */
class Engine implements IMachineListener{

	private List<IMachine> machines = new LinkedList<>();
	
	void launch(){
		next();
	}
	
    void addMower(Mower mower){
    	mower.addListener(this);
    	machines.add(mower);
    }

    /**
     * Supprime la tondeuse à l'index 0 de la liste et la démarre.
     */
    private void next(){
    	if(!machines.isEmpty()){
    		Mower next = (Mower) machines.remove(0);
            System.out.print("Start position: ") ; next.printPosition();
    		next.start();
    	}
    }

	@Override
	public void onFinish(IMachine machine) {
        System.out.print("  End position: "); machine.printPosition();
		next();
	}
}
