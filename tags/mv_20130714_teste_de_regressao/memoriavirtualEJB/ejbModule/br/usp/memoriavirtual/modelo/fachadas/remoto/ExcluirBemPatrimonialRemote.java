package br.usp.memoriavirtual.modelo.fachadas.remoto;

import java.util.List;

import javax.ejb.Remote;

import br.usp.memoriavirtual.modelo.entidades.bempatrimonial.BemPatrimonial;
import br.usp.memoriavirtual.modelo.fachadas.ModeloException;

@Remote
public interface ExcluirBemPatrimonialRemote {
	
	public List<BemPatrimonial> listarBensPatrimoniais(String nome) throws ModeloException;
	public BemPatrimonial recuperarDados(BemPatrimonial bem) throws ModeloException;
	public void excluirBem(BemPatrimonial bem) throws ModeloException;

}
