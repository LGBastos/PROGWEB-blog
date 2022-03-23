package br.ucsal.blog.model;

public class Post {
	
	private String titulo;
	private String texto;
	private String autor;
	
	
	
	public Post() {
			
	}
	
	
	

	public Post(String titulo, String texto, String autor) {
		this.autor = autor;
		this.texto = texto;
		this.titulo = titulo;
	}




	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
