package br.com.quixada.model;

public class Denuncia {
	private String idImagem;
	private String titulo;
	private String corpo;
	private String imagem;
	public Denuncia(String idImagem, String titulo, String corpo, String imagem) {
		super();
		this.idImagem = idImagem;
		this.titulo = titulo;
		this.corpo = corpo;
		this.imagem = imagem;
	}
	
	public Denuncia(){}

	public Denuncia(String titulo, String corpo, String imagem) {
		super();
		this.titulo = titulo;
		this.corpo = corpo;
		this.imagem = imagem;
	}

	public String getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(String idImagem) {
		this.idImagem = idImagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
}
