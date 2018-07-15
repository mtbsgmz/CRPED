package dao;

import java.util.List;

import org.hibernate.Session;

import entity.Project;
import interfaces.ICRUD;
import util.HibernateUtil;

public class ProjectDAO implements ICRUD<Project> {

	@Override
	public boolean create(Project varlik) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();

			session.getTransaction().begin();
			if (!session.contains(varlik)) {
				// session.merge(varlik);
			}
			session.saveOrUpdate(varlik);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session.isOpen())
				session.close();
		}
		return false;
	}

	@Override
	public Project read(Long id) {
		try {
			Project kisi = HibernateUtil.getSessionFactory().openSession().get(Project.class, id);
			return kisi;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Project varlik, Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Project varlik) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Project> readAll() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			return session.createQuery("from Project").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session.isOpen())
				session.close();
		}

		return null;
	}

}
