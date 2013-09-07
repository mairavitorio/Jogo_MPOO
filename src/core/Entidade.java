package core;

import org.newdawn.slick.Image;

public class Entidade {
	
	private TipoEndidade tipo;
	private int tamanho;
	private int nivel;
	private Image imagem;
	
	public Entidade(Image imagem, TipoEndidade tipo, int tamanho, int nivel){
		this.imagem = imagem;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.nivel = nivel;
	}

	public int getPremio(){
		return nivel + (10 * tamanho);
	}
	
	public TipoEndidade getTipo() {
		return tipo;
	}
	
	public Image getImagem(){
		return imagem;
	}

	public enum TipoEndidade {
		ASTECA, EGIPCIA;
	}

}
