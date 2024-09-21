package com.empresa.scm.scm_system.services;

import org.springframework.stereotype.Service;

@Service
public class PlanificacionDemandaService {
        public int calcularDemanda(int[] ventasHistoricas){
            if (ventasHistoricas.length==0){
                throw new IllegalArgumentException("Np se proporciona datos historicos");
            }
            int suma=0;
            for (int ventas : ventasHistoricas){
                suma += ventas;
            }
            return suma/ventasHistoricas.length;
        }
}
