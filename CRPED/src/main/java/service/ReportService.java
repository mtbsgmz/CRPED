package service;

import java.util.List;

import dao.ReportDAO;
import entity.Report;

public class ReportService {
	
ReportDAO reportDao = new ReportDAO();
	
	public void RaporEkle(Report rapor) {
		reportDao.create(rapor);
	}
	public Report RaporGoster(Long id) {
		return reportDao.read(id);
	}
	
	public void RaporSil(Long id) {
		reportDao.delete(id);
	}

	public List<Report> RaporlariGoster() {
		return reportDao.readAll();
	}
	
public void RaporGuncelle(Report rapor) {
	reportDao.update(rapor);
	
}
}
