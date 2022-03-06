package com.devops.clase2Devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devops.clase2Devops.servicios.NumeroRomanos;

import org.junit.jupiter.api.Test;

public class NumerosRomanosTest {
    
    // Pruebas importantes 1/5/10/50/100/500 ya que hay cambio de letra

    @Test
    void test(){

    assertEquals("I", NumeroRomanos.numToRomano(1));
    assertEquals("V", NumeroRomanos.numToRomano(5));
    assertEquals("IV", NumeroRomanos.numToRomano(4));
    assertEquals("VIII", NumeroRomanos.numToRomano(8));
    assertEquals("X", NumeroRomanos.numToRomano(10));
    assertEquals("XLIII", NumeroRomanos.numToRomano(43));
    assertEquals("L", NumeroRomanos.numToRomano(50));
    assertEquals("LVIII", NumeroRomanos.numToRomano(58));
    assertEquals("C", NumeroRomanos.numToRomano(100));
    assertEquals("CCXXXIV", NumeroRomanos.numToRomano(234));
    assertEquals("CDLXVII", NumeroRomanos.numToRomano(467));
    assertEquals("D", NumeroRomanos.numToRomano(500));
    assertEquals("DCLXXXVII", NumeroRomanos.numToRomano(687));
    assertEquals("DCCXXXIV", NumeroRomanos.numToRomano(734));
    assertEquals("DCCCLVI", NumeroRomanos.numToRomano(856));
    assertEquals("M", NumeroRomanos.numToRomano(1000));
    }

}
