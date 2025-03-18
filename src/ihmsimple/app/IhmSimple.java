package ihmsimple.app;

import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;
import ihmsimple.ctrl.Controller;

public class IhmSimple {
    
    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // VOTRE CODE ICI...
        Controller refCtrl = new Controller();
        ServiceDevine refServiceDevine = new ServiceDevine();
        View refView = new View();

        refCtrl.setRefServiceDevine(refServiceDevine);
        refCtrl.setRefView(refView);
        refCtrl.start();
        refView.setRefCtrl(refCtrl);;
        refServiceDevine.setRefCtrl(null);
    }

}
