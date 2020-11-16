package Controller;

import Model.*;
import View.*;

public class ProjetoMVC {

	public static void main(String[] args) {
        Sala SalaModel = new Sala("1", "VIP", "100");
		SalaView salaView = new SalaView();
        SalaController salaController = new SalaController(salaModel, salaView);
        
        salaController.printDetalheSala();

    }

}