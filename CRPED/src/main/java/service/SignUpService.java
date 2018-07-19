package service;

import java.util.List;

import dao.SignUpDAO;
import entity.SignUp;

public class SignUpService {

	SignUpDAO signUpDao = new SignUpDAO();
	
	public void KulEkle(SignUp kullanici) {
		signUpDao.create(kullanici);
	}
	public SignUp KulGoster(Long id) {
		return signUpDao.read(id);
	}
	public List<SignUp> KullanicilariGoster() {
		return signUpDao.readAll();
	}
}
