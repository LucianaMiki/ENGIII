package Model;

public class Sala{

    private String Codigo;
    private String Tipo;
    private int Capacidade;

    public Sala(String Codigo, String Tipo, int Capadidade){
        this.Codigo = Codigo;
        this.Tipo = Tipo;
        this.Capacidade = Capacidade;
    }

    public String getCodigo(){
        return Codigo;
    }
    
    public void setCodigo(String Codigo){
        this.Codigo = Codigo;
    }

    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public int getCapacidade(){
        return Capacidade;
    }
    
    public void setCapacidade(int Capacidade){
        this.Capacidade = Capacidade;
    }

}