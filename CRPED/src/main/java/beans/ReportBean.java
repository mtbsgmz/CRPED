package beans;

import java.io.Serializable;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.component.calendar.Calendar;

import entity.Report;
import service.ReportService;

@ManagedBean
@RequestScoped
public class ReportBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String selectedProject;
	private String consStatus;
	private String detail;
	private String rPrepared;
	private Date create;
	private ReportService reportService;
	
	public String getSelectedProject() {
		return selectedProject;
	}
	public void setSelectedProject(String selectedProject) {
		this.selectedProject = selectedProject;
	}
	public String getConsStatus() {
		return consStatus;
	}
	public void setConsStatus(String consStatus) {
		this.consStatus = consStatus;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getrPrepared() {
		return rPrepared;
	}
	public void setrPrepared(String rPrepared) {
		this.rPrepared = rPrepared;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	public ReportService getReportService() {
		return reportService;
	}
	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}
	
	@PostConstruct
	public void init() {
		reportService = new ReportService();
	}
	@Override
	public String toString() {
		return "ReportBean [selectedProject=" + selectedProject + ", consStatus=" + consStatus + ", detail=" + detail
				+ ", rPrepared=" + rPrepared + ", create=" + create + ", reportService=" + reportService + "]";
	}
	public void Save() {
		Report report = new Report();
		 Date date = new Date();		
		report.setSelectedProject(getSelectedProject());
		report.setConsStatus(getConsStatus());
		report.setDetail(getDetail());
		report.setrPrepared(getrPrepared());
		report.setCreate(getCreate());
		report.setCreatedTime(date);
		System.out.println(toString());
	}

	
	
	
	
}
