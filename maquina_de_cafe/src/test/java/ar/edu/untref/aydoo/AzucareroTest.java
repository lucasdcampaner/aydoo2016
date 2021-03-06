package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;


public class AzucareroTest {

	@Test
	public void testPoner10EnUnVaso() {
		
		Azucarero azucarero = new Azucarero();
		Vaso vaso = new Vaso();
		int cantidadAzucarEsperada = 10;
		
		azucarero.ponerNEnEsteVaso(vaso, cantidadAzucarEsperada);
		int cantidadAzucarObtenida = vaso.getCantidadAzucar();
		
		Assert.assertEquals(cantidadAzucarEsperada, cantidadAzucarObtenida);
		
	}

}
