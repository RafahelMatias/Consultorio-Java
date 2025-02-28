/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.Anamnese;

/**
 *
 * @author rafah
 */
public interface IAnamneseDAO {
    public void adiciona(Anamnese anamnese);
    public void altera(Anamnese anamnese);
    public void remove(int id);
    public List<Anamnese> listarTodos();
    public Anamnese getByID(int id);

}
