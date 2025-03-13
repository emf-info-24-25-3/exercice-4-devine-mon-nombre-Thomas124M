package ihmsimple.app;

import java.lang.ModuleLayer.Controller;

import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;

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
        refCtrl.setRefServiceDevine(refServiceDevine);
        View refView = new View();
        refCtrl.setRefView(refView);
        refView.setRefCtrl(null);
        refServiceDevine.setRefCtrl(null);
        refCtrl.start();
    }

}
