package br.eti.tiagosousa.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HomeBean {

	private String titulo = "Usuário";
	
	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}