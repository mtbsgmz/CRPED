package dao;

import java.util.List;

import org.hibernate.Session;

import entity.SignUp;
import interfaces.ICRUD;
import util.HibernateUtil;

public class LoginDAO implements ICRUD<SignUp> {

	@Override
	public boolean create(SignUp varlik) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SignUp read(Long id) {
		// TODO Auto-generated method stub
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
