package br.com.dio.desafios.poo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return 30;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
}
