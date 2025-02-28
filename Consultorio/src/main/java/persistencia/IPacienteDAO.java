package persistencia;

import java.util.List;
import negocio.Paciente;

/**
 *
 * @author Rafah
 */

public interface IPacienteDAO {
    public void adiciona(Paciente paciente);
    public void altera(Paciente paciente);
    public void remove(int id);
    public List<Paciente> listarTodos();
    public List<Paciente> listarTodosPorNome(String nomeP);
    public Paciente getByID(int id);
}
