package fr.orliac.interview.mower.app;

interface IMachineListener {
	// Interface permettant à notifier de la fin de l'exécution
    // des instructions de parcours
	void onFinish(IMachine machine);
}
