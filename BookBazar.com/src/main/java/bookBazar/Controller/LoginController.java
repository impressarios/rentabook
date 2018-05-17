package bookBazar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bookBazar.models.LoginModel;
import bookBazar.repositories.LoginRepository;

@RestController
public class LoginController {
	
	@Autowired
    LoginRepository loginRepository;

    @RequestMapping(method=RequestMethod.GET, value="/users")
    public Iterable<LoginModel> user() {
        return loginRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/user")
    public LoginModel save(@RequestBody LoginModel user) {
    	loginRepository.save(user);
    	
    	user.setMessage("CREATION_SUCCESS");

        return user;
    }

    @RequestMapping(method=RequestMethod.GET, value="/userid/{id}")
    public LoginModel show(@PathVariable String id) {
        return loginRepository.findById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/username/{name}")
    public LoginModel showUser(@PathVariable String name) {
        return loginRepository.findByUsername(name);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/user/{id}")
    public LoginModel update(@PathVariable String id, @RequestBody LoginModel user) {
        LoginModel updatedUser = loginRepository.findById(id);
        if(user.getUsername() != null)
        	updatedUser.setUsername(user.getUsername());
        if(user.getEmail() != null)
        	updatedUser.setEmail(user.getEmail());
        if(user.getPhoneNumber() > 0)
        	updatedUser.setPhoneNumber(user.getPhoneNumber());
        loginRepository.save(updatedUser);
        return updatedUser;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/user/{id}")
    public String delete(@PathVariable String id) {
        LoginModel user = loginRepository.findById(id);
        loginRepository.delete(user);

        return "user deleted";
    }

}
