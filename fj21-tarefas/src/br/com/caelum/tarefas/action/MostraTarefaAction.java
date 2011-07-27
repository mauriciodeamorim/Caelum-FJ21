package br.com.caelum.tarefas.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import br.com.caelum.tarefas.dao.TarefaDAO;
import br.com.caelum.tarefas.modelo.Tarefa;

public class MostraTarefaAction {
	private Tarefa tarefa;

	@Action(value="mostraTarefa", results={
			@Result(name="ok", location="mostra-tarefa.jsp")
	})
	public String execute() {
		tarefa = new TarefaDAO().buscaPorId(this.tarefa.getId());
		return "ok";
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

}
