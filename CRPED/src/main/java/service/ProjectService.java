package service;

import java.util.List;

import dao.ProjectDAO;
import entity.Project;


public class ProjectService {
	
	ProjectDAO projectDao = new ProjectDAO();
	
	public void ProjeEkle(Project kisi) {
		projectDao.create(kisi);
	}
	public Project ProjeGoster(Long id) {
		return projectDao.read(id);
	}

	public List<Project> KisileriGoster() {
		return projectDao.readAll();
	}

}
