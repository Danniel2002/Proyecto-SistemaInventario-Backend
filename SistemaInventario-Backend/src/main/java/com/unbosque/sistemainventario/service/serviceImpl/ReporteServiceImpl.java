package com.unbosque.sistemainventario.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.unbosque.sistemainventario.model.Reporte;
import com.unbosque.sistemainventario.repository.ReporteRepository;
import com.unbosque.sistemainventario.service.serviceApi.ReporteService;

@Service
@Transactional
public class ReporteServiceImpl implements ReporteService {

	
	
	 public ReporteRepository getReporteRepository() {
		return reporteRepository;
	}


	public void setReporteRepository(ReporteRepository reporteRepository) {
		this.reporteRepository = reporteRepository;
	}


	@Autowired
	    private ReporteRepository reporteRepository;
	
	
	 @Override
	    public List<Reporte> getReportes() {
	        List<Reporte> reporte = new ArrayList<>();
	        reporteRepository.findAll().forEach(reporte::add);
	        return reporte;
	    }

	 @Override
	    public Reporte insertReporte(Reporte reporte) {
	        return reporteRepository.save(reporte);
	    }
}
