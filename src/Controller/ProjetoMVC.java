package Controller;

import Dominio.Filme;
import Dominio.Resultado;
import Dominio.Sala;
import Dominio.Sessao;
import Fachada.Fachada;

public class ProjetoMVC {

	public static void main(String[] args) {
  
        Fachada fachada = new Fachada();
        Resultado resultado = new Resultado();
        
        Sala sala = new Sala();
        sala.setCodigo("1");
        sala.setTipo("1");
        sala.setCapacidade(1);
        resultado = fachada.Inserir(sala);
        resultado = fachada.Alterar(sala);
        resultado = fachada.Excluir(sala);
        
        sala.getCodigo();
        sala.getTipo();
        sala.getCapacidade();
        resultado = fachada.Consultar(sala);
        /*
       resultado = fachada.Consultar(sala);
        if(resultado.getMsg().length() == 0){
            System.out.println(resultado.getEntidades());
            for (EntidadeDominio entidade : resultado.getEntidades()){
                Sala salaaux = (Sala)entidade;
                salaaux.getCodigo();
               }
        }*/
                
        Filme filme = new Filme();
        filme.setTitulo("Testando");
        filme.setDiretor("Alfredo");
        filme.setElenco("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        filme.setEstreia("24-08-2000");
        filme.setSinopse("ooooooooooooooooooooo");
        //filme.setDuracao(time(01:00));
        
        fachada.Inserir(filme);
        fachada.Alterar(filme);
        fachada.Excluir(filme);
        
        filme.getTitulo();
        filme.getDiretor();
        filme.getElenco();
        filme.getEstreia();
        filme.getSinopse();
        filme.getDuracao();
        resultado = fachada.Consultar(filme);
        
        
        Sessao sessao = new Sessao();
        sessao.setValor_meia(15);
        sessao.setValor_inteira(30);
        sessao.setDt_incio("24-11-2020");
        sessao.setDt_fim("12-12-2020");
        sessao.setFxe(3);
        sessao.setSala(sala);
        sessao.setFilme(filme);
        
        fachada.Inserir(sessao);
        fachada.Alterar(sessao);
        fachada.Excluir(sessao);
        
        sessao.getValor_meia();
        sessao.getValor_inteira();
        sessao.getDt_incio();
        sessao.getDt_fim();
        sessao.getFxe();
        sessao.getSala();
        sessao.getFilme();
        resultado = fachada.Consultar(sessao);
        
        
        }

}
