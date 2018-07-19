package dao;

import java.util.List;

import org.hibernate.Session;

import entity.SignUp;
import interfaces.ICRUD;
import util.HibernateUtil;

public class SignUpDAO implements ICRUD<SignUp> {

	@Override
	public boolean create(SignUp varlik) {
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
	public SignUp read(Long id) {
		try {
			SignUp uye = HibernateUtil.getSessionFactory().openSession().get(SignUp.class, id);
			return uye;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(SignUp varlik, Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(SignUp varlik) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SignUp> readAll() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			return session.createQuery("from SignUp").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session.isOpen())
				session.close();
		}
		return null;
	}

}
