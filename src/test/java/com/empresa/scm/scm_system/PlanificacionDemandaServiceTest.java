package com.empresa.scm.scm_system;

import com.empresa.scm.scm_system.services.PlanificacionDemandaService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PlanificacionDemandaServiceTest {
    @Test
    public void calcularDemandaHistorica(){
        //Datos historicos de ventas(meses anteriores)
        int[] vesntasHistoricas= {100,150,120,130,170};
        PlanificacionDemandaService servicio = new PlanificacionDemandaService();
        int demandaEsperada = 134; //Promedio de las ventas históricas
        int demandaCalculada = servicio.calcularDemanda(vesntasHistoricas);

        assertEquals(demandaEsperada, demandaCalculada);
    }
}
