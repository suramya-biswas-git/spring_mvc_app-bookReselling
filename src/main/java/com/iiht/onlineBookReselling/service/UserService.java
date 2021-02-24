package com.iiht.onlineBookReselling.service;

import com.iiht.onlineBookReselling.dto.UserDTO;

public interface UserService {
	public void save(UserDTO user) throws Exception;
	public UserDTO findUser(UserDTO user) throws Exception; 
	public int generateId() throws Exception;
}
