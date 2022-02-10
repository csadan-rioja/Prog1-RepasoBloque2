package com.iescomercio.prog1.bloque2.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Set;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	void testHayRepetidos() {
		ArrayList<String> conRepetidos = new ArrayList<>(Set.of("examen", "prueba", "repaso", "PrUeBa"));
		ArrayList<String> sinRepetidos = new ArrayList<>(Set.of("examen", "prueba", "repaso", "carlos"));

		assertTrue(Ejercicio1.hayRepetidos(conRepetidos));
		assertFalse(Ejercicio1.hayRepetidos(sinRepetidos));
	}

	@Test
	void testOrdenarArray() {
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.addAll(Set.of(10,20,1,3));
		ArrayList<Integer> listaEnterosOrdenados = new ArrayList<Integer>();
		listaEnterosOrdenados.addAll(Set.of(20, 10, 3, 1));
		
		assertArrayEquals(listaEnterosOrdenados.toArray(), listaEnteros.toArray());
		
		listaEnteros.add(3);
		listaEnterosOrdenados.add(3);
		assertArrayEquals(listaEnterosOrdenados.toArray(), listaEnteros.toArray());
	}

	@Test
	void testBuscarPalabra() {
		char[][] sopaLetras = new char[5][5];

		sopaLetras[0][0] = 'a';
		sopaLetras[0][1] = 'b';
		sopaLetras[0][2] = 'c';
		sopaLetras[0][3] = 't';
		sopaLetras[0][4] = 'n';

		sopaLetras[1][0] = 'a';
		sopaLetras[1][1] = 'b';
		sopaLetras[1][2] = 'c';
		sopaLetras[1][3] = 'a';
		sopaLetras[1][4] = 'i';

		sopaLetras[2][0] = 'l';
		sopaLetras[2][1] = 's';
		sopaLetras[2][2] = 't';
		sopaLetras[2][3] = 'a';
		sopaLetras[2][4] = 'e';

		sopaLetras[3][0] = 'a';
		sopaLetras[3][1] = 'b';
		sopaLetras[3][2] = 'c';
		sopaLetras[3][3] = 'r';
		sopaLetras[3][4] = 't';

		sopaLetras[4][0] = 'd';
		sopaLetras[4][1] = 'i';
		sopaLetras[4][2] = 'e';
		sopaLetras[4][3] = 't';
		sopaLetras[4][4] = 'a';
		
		assertTrue(Ejercicio1.buscarPalabra(sopaLetras, "dieta"));
		assertTrue(Ejercicio1.buscarPalabra(sopaLetras, "nieta"));
		assertFalse(Ejercicio1.buscarPalabra(sopaLetras, "tauro"));


	}

}
