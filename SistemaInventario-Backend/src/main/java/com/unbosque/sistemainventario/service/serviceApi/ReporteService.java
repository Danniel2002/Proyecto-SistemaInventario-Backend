package com.unbosque.sistemainventario.service.serviceApi;

import java.util.List;


import com.unbosque.sistemainventario.model.Reporte;



public interface ReporteService {

	 List<Reporte> getReportes();
	 Reporte insertReporte(Reporte reporte);
}
