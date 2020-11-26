package Dominio;

import Strategy.IStrategy;

public class Func extends EntidadeDominio{
    private String Email;
    private String Senha;
    private String Permss;
    	
		public Func(String email, String senha, String permss) {
		super();
                this.Email = email;
                this.Senha = senha;
                this.Permss = permss;
	}

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getPermss() {
        return Permss;
    }

    public void setPermss(String Permss) {
        this.Permss = Permss;
    }
	
}
