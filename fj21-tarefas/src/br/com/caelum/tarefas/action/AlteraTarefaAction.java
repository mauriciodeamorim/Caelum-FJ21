package br.com.caelum.tarefas.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import br.com.caelum.tarefas.dao.TarefaDAO;
import br.com.caelum.tarefas.modelo.Tarefa;

public class AlteraTarefaAction {
	private Tarefa tarefa;

	@Action(value="alteraTarefa", results={
			@Result(name="ok", type="redirectAction",
					params={"actionName", "listaTarefas"})
	})
	public String execute() {
		new TarefaDAO().altera(tarefa);
		return "ok";
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
}
