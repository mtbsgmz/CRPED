package beans;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entity.Project;
import entity.Status;
import service.ProjectService;

@ManagedBean
@RequestScoped
public class ProjectBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double cost;
	private String manager;
	private Status STATUS;
	private String location;
	private Date baslangic;
	private Date bitis;
	private Long account_id;	//oturumun açıldığı account id proje oluşturulurken buraya set edilecek
	private String description;
	private ProjectService projectService;

	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Status getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(Status sTATUS) {
		STATUS = sTATUS;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Date getBaslangic() {
		return baslangic;
	}
	public void setBaslangic(Date baslangic) {
		this.baslangic = baslangic;
	}
	public Date getBitis() {
		return bitis;
	}
	public void setBitis(Date bitis) {
		this.bitis = bitis;
	}
	public ProjectService getProjectService() {
		return projectService;
	}
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	
	@PostConstruct
	public void init() {
		projectService = new ProjectService();
	}

	
	@Override
	public String toString() {
		return "ProjectBean [name=" + name + ", cost=" + cost + ", manager=" + manager + ", STATUS=" + STATUS
				+ ", location=" + location + ", baslangic=" + baslangic + ", bitis=" + bitis + ", account_id="
				+ account_id + ", description=" + description + ", projectService=" + projectService + "]";
	}
	public void Save() {
		System.out.println(toString());
		Project project = new Project();
		project.setName(getName());
		project.setBaslangic(getBaslangic());
		project.setBitis(getBitis());
		project.setManager(getManager());
		project.setManager(getManager());
		project.setLocation(getLocation());
		project.setSTATUS(getSTATUS());
		project.setDescription(getDescription());

		
	}
	
	
	
	
}
