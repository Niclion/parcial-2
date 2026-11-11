
package parcial2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class pruebaparcial {
	private parcial p;

    @BeforeEach
    public void setUp() {
        p = new parcial();}

    @Test
    public void testDosRaices() {
        String resultado = p.calcularRaices(1, -5, 6);
        assertEquals("x1 = 3, x2 = 2", resultado);}

    @Test
    public void testRaizDoble() {
        String resultado = p.calcularRaices(1, -2, 1);
        assertEquals("x1 = x2 = 1", resultado);}

    @Test
    public void testSinRaicesReales() {
        assertThrows(IllegalArgumentException.class, () -> {
            p.calcularRaices(1, 2, 5);
        });}

    @Test
    public void testCoeficienteCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            p.calcularRaices(0, 2, 1);});}

    @Test
    public void testRaicesDecimales() {
        String resultado = p.calcularRaices(2, -5, 2);
        assertEquals("x1 = 2, x2 = 0,50", resultado);}

    @Test
    public void testRaicesNegativas() {
        String resultado = p.calcularRaices(1, 5, 6);
        assertEquals("x1 = -2, x2 = -3", resultado);}}
