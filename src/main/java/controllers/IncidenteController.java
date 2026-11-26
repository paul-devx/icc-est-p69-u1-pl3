package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        // TODO S: ordenar la misma lista con List.sort y el orden natural; devolverla.
        incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        // TODO B: implementar búsqueda binaria utilizando compareTo.
        if (incidentes== null || objetivo == null) {
            throw new NullPointerException();
        }
        int inicio = 0;
        int fin = incidentes.size() - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int resultado = incidentes.get(medio).compareTo(objetivo);
            if (resultado == 0) {
                return medio;
            }
            if (resultado < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
