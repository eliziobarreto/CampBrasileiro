package br.ufpb.javasport;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.javasport.Time;

public class TimeTest {

	@Test
	public void test() {
		Time t = new Time("Vasco da Gama","S�o Janu�rio","1� Colocado");
		assertTrue(t.getNomeTime().equals("Vasco da Gama"));
		assertEquals("Vasco da Gama", t.getNomeTime());
		assertTrue(t.getEstadio().equals("S�o Janu�rio"));
		assertEquals("S�o Janu�rio",t.getEstadio());
	}

}
