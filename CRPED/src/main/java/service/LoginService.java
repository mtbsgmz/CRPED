package service;

import java.util.List;

import dao.LoginDAO;
import entity.SignUp;

public class LoginService {
	
LoginDAO loginDao = new LoginDAO();
	
	
//onceden kaydi yapilan kullanicilari veritabanindan alarak kontrol yapilacak
	public List<SignUp> KisileriGoster() {
		return loginDao.readAll();
	}
}
