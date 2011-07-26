package br.com.caelum.tarefas.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import br.com.caelum.tarefas.dao.TarefaDAO;
import br.com.caelum.tarefas.modelo.Tarefa;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

@SuppressWarnings("serial")
@Validations(requiredStrings={
		@RequiredStringValidator(fieldName="tarefa.descricao", message="Valor obrigatorio")
}, stringLengthFields={
		@StringLengthFieldValidator(fieldName="tarefa.descricao",
				minLength="5", message="Minimo de 5 caracteres")
})
public class AdicionaTarefasAction extends ActionSupport {

	private Tarefa tarefa;

	@Action(value="adicionaTarefas", results = {
			@Result(name="ok", location="tarefa-adicionada.jsp"),
			@Result(name="input", location="/formulario-tarefas.jsp")
	})

	public String execute(){
		new TarefaDAO().adiciona(tarefa);
		return "ok";
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

}
