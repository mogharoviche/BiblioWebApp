package service;

import model.dao.AdherentDao;
import model.entity.Adherent;

public class AdherentService {
	
	public boolean registerUser(Adherent adherent) {
		// Additional validation logic 
		// Use UserDao to perform database operations
			AdherentDao adherentDao =new AdherentDao();
	        return adherentDao.addAdherent(adherent);


	}
}
