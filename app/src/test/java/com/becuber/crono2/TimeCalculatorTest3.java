package com.becuber.crono2;

import static org.junit.Assert.assertEquals;

import com.becuber.crono2.model.Cylinder;
import com.becuber.crono2.model.CylinderSystemAmerican;
import com.becuber.crono2.model.Pressure;
import com.becuber.crono2.model.TimeCalculator;
import com.becuber.crono2.model.UnitPressure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TimeCalculatorTest3 {

    private final BigDecimal volumen;
    private final int flujo;
    private final String tiempoEsperado;

    // Constructor que recibe los parámetros
    public TimeCalculatorTest3(BigDecimal volumen, int flujo, String tiempoEsperado) {
        this.volumen = volumen;
        this.flujo = flujo;
        this.tiempoEsperado = tiempoEsperado;
    }

    // Parámetros: Volumen (L), Flujo (L/min), Tiempo esperado (hh:mm)
    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{

                // D size PHTLS
                {CylinderSystemAmerican.D.getVol1Bar(), 2, "02:30"},
                {CylinderSystemAmerican.D.getVol1Bar(), 5, "01:00"},
                {CylinderSystemAmerican.D.getVol1Bar(), 10, "00:30"},
                {CylinderSystemAmerican.D.getVol1Bar(), 15, "00:18"},

                // E size
                {CylinderSystemAmerican.E.getVol1Bar(), 2, "04:24"},
                {CylinderSystemAmerican.E.getVol1Bar(), 5, "01:48"},
                {CylinderSystemAmerican.E.getVol1Bar(), 10, "00:54"},
                {CylinderSystemAmerican.E.getVol1Bar(), 15, "00:36"},

                // G size
                {CylinderSystemAmerican.G.getVol1Bar(), 2, "38:12"},
                {CylinderSystemAmerican.G.getVol1Bar(), 5, "15:18"},
                {CylinderSystemAmerican.G.getVol1Bar(), 10, "07:36"},
                {CylinderSystemAmerican.G.getVol1Bar(), 15, "05:06"}
        });
    }

    @Test
    public void testFormatoTiempoParametrizado() {
        // Presión constante de 2100 psi
        Pressure pressure = new Pressure(new BigDecimal(2100), UnitPressure.PSI);

        // Crear la Botella2 con el volumen correspondiente
        Cylinder cylinder = new Cylinder(pressure, volumen);

        // Convertir el flujo a BigDecimal
        BigDecimal flujoBD = new BigDecimal(flujo);

        // Obtener el tiempo formateado
        String tiempoCalculado = TimeCalculator.formatTime(cylinder, flujoBD);

        // Verificar que el tiempo calculado coincide con el esperado
        assertEquals(tiempoEsperado, tiempoCalculado);
    }

}
