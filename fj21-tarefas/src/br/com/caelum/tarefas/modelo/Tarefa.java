package br.com.caelum.tarefas.modelo;

import java.util.Calendar;

public class Tarefa {
	private Long id;
	private String descricao;
	private boolean finalizado;
	private Calendar dataFinalizado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		System.out.println("chamando o get descricao");
		return descricao;
	}

	public void setDescricao(String descricao) {
		System.out.println("chamando o set descricao");
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizado() {
		return dataFinalizado;
	}

	public void setDataFinalizado(Calendar dataFinalizado) {
		this.dataFinalizado = dataFinalizado;
	}

}
