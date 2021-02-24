package com.iiht.onlineBookReselling.dao;

import java.util.List;

import com.iiht.onlineBookReselling.model.User;

public interface UserDao {
	public void save(User user) throws Exception;
	public List<User> findUser(User user) throws Exception;
	public List<Integer> generateId() throws Exception;

}
