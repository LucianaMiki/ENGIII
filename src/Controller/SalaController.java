package Controller;

import Model.Sala;
import View.SalaView;

public class SalaController {

    private Sala salaModel;
    private SalaView salaView;
    
    public SalaController(Sala salaModel, SalaView salaView){
		this.salaModel = salaModel;
		this.salaView = salaView;
    }
    
    public String getCodigo() {
		return salaModel.getCodigo();
	}

	public void setCodigo(String Codigo) {
		salaModel.setCodigo(Codigo);
	}
	
    public String getTipo(){
        return salaModel.getTipo();
    }

    public void setTipo(String Tipo){
        salaModel.setTipo(Tipo);
    }

    public int getCapacidade(){
        return salaModel.getCapacidade();
    }
    
    public void setCapacidade(int Capacidade){
        salaModel.setCapacidade(Capacidade);
    }
    
    public void printDetalheSala(){
		salaView.printDetalheSala(this.getCodigo(),this.getTipo(),this.getCapacidade());
    }

}