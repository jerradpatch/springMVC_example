package com.Test.App.Service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Test.DAO.UserDAO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@ResponseBody
@RequestMapping("/UserService")
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@Inject
	UserDAO userDAO;
	
	@RequestMapping(value = "/getAllUserData", method = RequestMethod.GET)
	public String GetListOfMember() 
			throws JsonProcessingException {
		
		logger.info("getAllUserData request recieved");
		
		return mapper.writeValueAsString(userDAO.getAllUserData());
	}

}
