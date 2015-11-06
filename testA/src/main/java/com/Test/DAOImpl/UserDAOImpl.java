package com.Test.DAOImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.ParseLong;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.Test.DAO.UserDAO;
import com.Test.Model.UserModel;

public class UserDAOImpl implements UserDAO, InitializingBean{

	final static Logger logger = Logger.getLogger(UserDAOImpl.class);
	
	List<UserModel> userModelList = null;
	
	
	public List<UserModel> getAllUserData(){
		return userModelList;
	}

	/* initialize array */
	public void afterPropertiesSet() throws Exception {
		URL resource = UserDAOImpl.class.getResource("/user.csv");
		logger.info("path: "+resource);
		readCSVFile(resource.getPath());
	}
		
	/* Utility function */
	//code graciously supplied via  http://www.codejava.net/coding/super-csv-reading-csv-files-into-pojos-with-csvbeanreader
	void readCSVFile(String csvFileName) {

	    CellProcessor[] processors = new CellProcessor[] {
	            new ParseLong(), // id
	            new NotNull(), // fname
	            new NotNull(), // lname
	            new NotNull(), // username
	            new ParseDouble(),// latitude
	            new ParseDouble(),// longitude
	            new NotNull(),// gender
	            new ParseInt(),// age
	            new NotNull(),// comments
	            new ParseLong(),// likes
	            new ParseLong(),// dislikes
	            new ParseLong()// retweets
	    };
	 
	    logger.info("initializing the CSV file");
	    userModelList = new ArrayList<UserModel>();
	    CsvBeanReader beanReader = null;
		try {
	        beanReader = new CsvBeanReader(new FileReader(csvFileName),
	                CsvPreference.STANDARD_PREFERENCE);
	        String[] header = beanReader.getHeader(true);
	        UserModel userModel = null;
	        
	        while ((userModel = beanReader.read(UserModel.class, header, processors)) != null) {
	        	logger.info("adding a user Model");
	        	userModelList.add(userModel);
	        }
	    } catch (FileNotFoundException ex) {
	        System.err.println("Could not find the CSV file: " + ex);
	    } catch (IOException ex) {
	        System.err.println("Error reading the CSV file: " + ex);
	    } finally {
	        if (beanReader != null) {
	            try {
	                beanReader.close();
	            } catch (IOException ex) {
	                System.err.println("Error closing the reader: " + ex);
	            }
	        }
	        userModelList = Collections.unmodifiableList(userModelList);
	    }
	}

}
