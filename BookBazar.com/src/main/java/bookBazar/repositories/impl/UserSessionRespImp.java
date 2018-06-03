/**
 * 
 */
package bookBazar.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import bookBazar.models.PDO.UserSessionPDO;
import bookBazar.repositories.UserSessionRepository;

/**
 * @author Raunak
 *
 */
@Repository
public class UserSessionRespImp implements UserSessionRepository{

	RedisTemplate<String, Object> redisTemplate;
	
	HashOperations<String,String,Object> hashOperations;
	
	private static final String KEY = "UserSession";
	
	@Autowired
	public UserSessionRespImp(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}
	
	@Override
	public void saveUserSession(UserSessionPDO userSession) {
		hashOperations.put(KEY, userSession.getUserId(), userSession);
	}

	@Override
	public UserSessionPDO getUserSession(String userId) {
		return (UserSessionPDO)hashOperations.get(KEY, userId);
	}

	@Override
	public void distroyUserSession(String userId) {
		hashOperations.delete(KEY, userId);
	}

}
