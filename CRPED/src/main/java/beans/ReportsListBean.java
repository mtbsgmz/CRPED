package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entity.Report;
import service.ReportService;

@ManagedBean
@RequestScoped
public class ReportsListBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Report report = new Report();
	private boolean isDeleteButtonShow = false;
	private boolean isUpdateButtonShow = false;
	private ReportService reportService;
	
	@PostConstruct
	public void init() {
		reportService = new ReportService();
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public boolean isDeleteButtonShow() {
		return isDeleteButtonShow;
	}

	public void setDeleteButtonShow(boolean isDeleteButtonShow) {
		this.isDeleteButtonShow = isDeleteButtonShow;
	}

	public boolean isUpdateButtonShow() {
		return isUpdateButtonShow;
	}

	public void setUpdateButtonShow(boolean isUpdateButtonShow) {
		this.isUpdateButtonShow = isUpdateButtonShow;
	}
	
	public List<Report> raporlariGetir() {
		return reportService.RaporlariGoster();
	}

	public String RaporGuncelle() {
		return "listele";
	}
	
	public String RaporSil() {
		return "listele";
	}

	public String RaporSec(Long id) {
		Report report = reportService.RaporGoster(id);
		setReport(report);
		setUpdateButtonShow(true);
		setUpdateButtonShow(true);		
		return "listele";
	}
	
	
	
}
