package command;

import Fachada.Fachada;
import Fachada.IFachada;

public abstract class AbstractCommand implements ICommand{
	
	protected IFachada fachada = new Fachada();

}