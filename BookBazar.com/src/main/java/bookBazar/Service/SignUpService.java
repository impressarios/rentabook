package bookBazar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookBazar.Controller.LoginController;
import bookBazar.repositories.LoginRepository;

@Service
public class SignUpService {
	@Autowired LoginController login;
	@Autowired LoginRepository loginRepository;
	
	
}
