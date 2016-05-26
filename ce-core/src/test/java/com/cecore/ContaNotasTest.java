package com.cecore;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaNotasTest {

	@Test
	public void sacarDez() {
		ContaNotas contaNotas = new ContaNotas();
		assertEquals(1, contaNotas.executar(10));
	}


	@Test
	public void sacarVinte() {
		ContaNotas contaNotas = new ContaNotas();
		assertEquals(1, contaNotas.executar(20));
	}

}
