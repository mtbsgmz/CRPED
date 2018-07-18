package service;

import java.util.List;

import dao.ReportDAO;
import entity.Report;



public class ReportService {
	
ReportDAO reportDao = new ReportDAO();
	
	public void RaporEkle(Report rapor) {
		reportDao.create(rapor);
	}
	public Report ProjeGoster(Long id) {
		return reportDao.read(id);
	}

	public List<Report> ProjeleriGoster() {
		return reportDao.readAll();
	}
	

}
