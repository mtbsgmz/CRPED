package dao;

import java.util.List;

import org.hibernate.Session;

import entity.Report;
import interfaces.ICRUD;
import util.HibernateUtil;

public class ReportDAO implements ICRUD<Report> {

	@Override
	public boolean create(Report varlik) {
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
	public boolean delete(Long id) {
		
		return false;
	}

	@Override
	public Report read(Long id) {
		try {
			Report rapor = HibernateUtil.getSessionFactory().openSession().get(Report.class, id);
			return rapor;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Report varlik, Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Report varlik) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public List<Report> readAll() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			return session.createQuery("from Report").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session.isOpen())
				session.close();
		}
		return null;
	}

}
