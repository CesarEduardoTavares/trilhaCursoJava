package br.com.cod3r.CM.Modelo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.CM.Excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}

	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo (3,2);
		boolean resultado = campo.adiconarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo (3,4);
		boolean resultado = campo.adiconarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinho = new Campo (2,3);
		boolean resultado = campo.adiconarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinho = new Campo (4,3);
		boolean resultado = campo.adiconarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo (2,2);
		boolean resultado = campo.adiconarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo (1,1);
		boolean resultado = campo.adiconarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse (campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMacacao();
		assertTrue (campo.isMarcado());
	}
	
	@Test
	void testeAltenarMarcacaoDuasChamadas() {
		campo.alternarMacacao();
		campo.alternarMacacao();
		assertFalse (campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue (campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMacacao();
		assertFalse (campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMacacao();
		campo.minar();
		assertFalse (campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
		campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos1() {

		
		Campo campo11 = new Campo(1,1);
		
		Campo campo22 = new Campo(2,2);
		campo22.adiconarVizinho(campo11);
		
		campo.adiconarVizinho(campo22);
		campo.abrir();
		assertTrue (campo22.isAberto()&& campo11.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {

		
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,1);
		campo12.minar();
		Campo campo22 = new Campo(2,2);
		campo22.adiconarVizinho(campo11);
		campo22.adiconarVizinho(campo12);
		
		campo.adiconarVizinho(campo22);
		campo.abrir();
		assertTrue (campo22.isAberto()&& campo11.isFechado());
	}
	
}



