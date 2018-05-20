package bookBazar.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;


import bookBazar.models.UserSessionModel;

public interface UserSessionRepository extends MongoRepository<UserSessionModel, String>{

}
