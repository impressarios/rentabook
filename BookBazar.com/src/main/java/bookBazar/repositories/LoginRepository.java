package bookBazar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bookBazar.models.LoginModel;

public interface LoginRepository extends CrudRepository<LoginModel, String> {
	
	LoginModel findById(String id);
	
	LoginModel findByUsername(@Param("name") String name);
	
	LoginModel findByContact(@Param("contact") String contact);
	
	LoginModel findByEmail(@Param("email") String email);

    @Override
    void delete(LoginModel deleted);
}
