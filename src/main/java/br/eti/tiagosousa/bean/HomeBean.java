package br.eti.tiagosousa.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HomeBean {

	private String titulo = "Spring JavaServer Faces Template";
	
	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}