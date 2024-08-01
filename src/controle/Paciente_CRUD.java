package controle;

import java.sql.PreparedStatement;
import model.Paciente_model;

/**
 *
 * @author jao07
 */
public class Paciente_CRUD {
    Conexao co = new Conexao();
    
    public void salvar(Paciente_model Paci){
     co.conectar();
     /*
     PreparedStatement pacici = co.con.prepareStatement(
     "INSERT INTO Paciente(fk_restricoes_idrestricoes, nome_paciente,cpf,telefone,data_nasc,endereco, sexo) " +
     "VALUES( ?, ?, ?, ?, ?, ? )");
     */
     
    }
}
