package bookBazar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import bookBazar.models.PDO.UserPDO;

public interface UserRepository extends MongoRepository<UserPDO, String> {
	
	UserPDO findById(String id);
	
	UserPDO findByUsername(@Param("name") String name);
	
	UserPDO findByContact(@Param("contact") String contact);
	
	UserPDO findByEmail(@Param("email") String email);

    @Override
    void delete(UserPDO deleted);
    
}
