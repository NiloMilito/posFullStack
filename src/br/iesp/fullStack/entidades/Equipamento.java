package br.iesp.fullStack.entidades;

public class Equipamento {
	private Long id;
	private String nome;
	
	public Equipamento(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
