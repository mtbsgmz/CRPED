package entity;

import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

import service.ReportService;

public class Report implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "REP_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "REP_SEQ")
	@GeneratedValue(generator = "REP_SEQ", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String selectedProject;
	private String consStatus;
	private String detail;
	private String rPrepared;
	@Temporal(DATE)
	private Date create;
	private ReportService reportService;
	private Long account_id;
	private Date createdTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	
	
	

}
