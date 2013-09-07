package core;

import java.util.Random;

import org.newdawn.slick.SlickException;

import util.GeradorEntidades;

public class Mapa {
	
	private final int LINHAS = 8;
	private final int COLUNAS = 6;
	
	private Entidade[][] entidades;
	
	public Mapa() throws SlickException{
		entidades = new Entidade[LINHAS][COLUNAS];
		
		for(int geradas = 0; geradas < 4; geradas++){
			int linhaRandom = new Random().nextInt(LINHAS - 1);
			int colunaRandom = new Random().nextInt(COLUNAS - 1);
			
			if(entidades[linhaRandom][colunaRandom] == null){
				entidades[linhaRandom][colunaRandom] = GeradorEntidades.gerar();
			}
		}
	}
	
	public void addEntidade(Entidade entidade, int linha, int coluna){
		entidades[linha][coluna] = entidade;
		
	}
	
	public Entidade[][] getEntidades(){
		return entidades;
	}
	
	public Entidade getEntidade(int linha, int coluna){
		return entidades[linha][coluna];
	}
	
	public int getLinhas(){
		return LINHAS;
	}
	
	public int getColunas(){
		return COLUNAS;
	}
}
