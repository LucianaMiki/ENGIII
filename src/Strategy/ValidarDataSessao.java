package Strategy;

import Dominio.EntidadeDominio;
import Dominio.Sessao;
import dao.SessaoDAO;
import dao.IDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidarDataSessao implements IStrategy {

    public String processar(EntidadeDominio entidade) {
        Date dataInicial, dataFinal;
        String strDataInicial = "14-01-2017";
        String strDataFinal = "14-01-2017";
        SimpleDateFormat sdf1 = new SimpleDateFormat("DD-MM-YYYY");
        SimpleDateFormat sdf2 = new SimpleDateFormat("DD-MM-YYYYY");
        try {

            dataFinal = sdf1.parse(strDataFinal);
            dataInicial = sdf2.parse(strDataInicial);
            System.out.println(dataInicial.compareTo(dataFinal));
            System.out.println(dataInicial.after(dataFinal));
            if (dataInicial.compareTo(dataFinal) == 1) {
                return "A data de finalização da sessao deve ser menor do que a data de inicio!";
            }

        } catch (ParseException ex) {
            Logger.getLogger(ValidarDataSessao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

