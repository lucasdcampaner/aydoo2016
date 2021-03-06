package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class MaquinaExpendedoraDeBebidasTest {

	@Test
	public void testHacerCafeConLecheCon10DeAzucar() {
		
		MaquinaExpendedoraDeBebidas maquinaExpendedoraDeBebidas = new MaquinaExpendedoraDeBebidas();
		Vaso vasoEsperado = new Vaso();
		int cantidadAzucar = 10;
		vasoEsperado.agregarContenido(Contenido.CAFE);
		vasoEsperado.agregarContenido(Contenido.LECHE);
		vasoEsperado.setCantidadAzucar(cantidadAzucar);
		Vaso vasoObtenido = new Vaso();
		
		vasoObtenido = maquinaExpendedoraDeBebidas.hacerCafeConLecheConNDeAzucar(vasoObtenido, cantidadAzucar);
		
		Assert.assertEquals(vasoEsperado.getContenido(), vasoObtenido.getContenido());
		
	}

	@Test
	public void testhacerTeConLecheCon10DeAzucar() {
		
		MaquinaExpendedoraDeBebidas maquinaExpendedoraDeBebidas = new MaquinaExpendedoraDeBebidas();
		Vaso vasoEsperado = new Vaso();
		int cantidadAzucar = 10;
		vasoEsperado.agregarContenido(Contenido.TE);
		vasoEsperado.agregarContenido(Contenido.LECHE);
		vasoEsperado.setCantidadAzucar(cantidadAzucar);
		Vaso vasoObtenido = new Vaso();
		
		vasoObtenido = maquinaExpendedoraDeBebidas.hacerTeConLecheConNDeAzucar(vasoObtenido, cantidadAzucar);
		
		Assert.assertEquals(vasoEsperado.getContenido(), vasoObtenido.getContenido());
		
	}


}
