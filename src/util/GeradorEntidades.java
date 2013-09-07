package util;

import java.util.Random;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import core.Entidade;
import core.Entidade.TipoEndidade;

public class GeradorEntidades {

	public static Entidade gerar() throws SlickException{
		
		Random tipoRandom = new Random();
		TipoEndidade tipo = TipoEndidade.values()[tipoRandom.nextInt(1)];
		//TODO atribuir imagem de acordo com o tipo
		Image imagem = new Image("resources/imagens/azarvore.png");
		int tamanho = 1;
		int nivel = 1;
		
		Entidade entidade = new Entidade(imagem, tipo, tamanho, nivel);
		
		return entidade;
	}
}
