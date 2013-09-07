package core;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

import util.GeradorEntidades;

public class Game extends BasicGame {
	
	private Sound somAmbiente;
	private Mapa mapa;
	
	
	public Game(String title) {
		super(title);
	}
	
	@Override
	public void init(GameContainer container) throws SlickException {
		mapa = new Mapa();
		
		somAmbiente = new Sound("resources/audios/nature.wav");
		somAmbiente.loop();
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	}
	
	@Override
	public void mouseReleased(int button, int x, int y) {
		int linha = x/100, coluna = y/100;
		
		if(mapa.getEntidade(linha, coluna) == null){
			try {
				mapa.addEntidade(GeradorEntidades.gerar(), linha, coluna);
			} catch (SlickException e) {
				e.printStackTrace();
			}
		}
		
		super.mouseReleased(button, x, y);
	}
	
	@Override
	public void render(GameContainer container, Graphics tela) throws SlickException {
		for(int linha = 0; linha < mapa.getLinhas(); linha ++){
			for(int coluna = 0; coluna < mapa.getColunas(); coluna++){
				if(mapa.getEntidade(linha, coluna) != null){
						tela.drawImage(mapa.getEntidade(linha, coluna).getImagem(), linha*100, coluna*100);
				}
			}
		}
	}
	
}
